package com.nftime.klaymakers.controller;

import com.nftime.klaymakers.exception.ErrorType;
import com.nftime.klaymakers.exception.ErrorTypeException;
import com.nftime.klaymakers.exception.FailureResult;
import com.nftime.klaymakers.exception.GeneralErrorType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

/**
 * Created by dukedev1004@crossangle.io on 11/27/23
 */
@Slf4j
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<FailureResult> exception(Exception e) {
        log.error(e.getMessage(), e);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new FailureResult(GeneralErrorType.GENERAL_EXCEPTION, e.getMessage()));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<FailureResult> exception(RuntimeException e) {
        log.error(e.getMessage(), e);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new FailureResult(GeneralErrorType.GENERAL_RUNTIME_EXCEPTION, e.getMessage()));
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<FailureResult> exception(MissingServletRequestParameterException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new FailureResult(e));
    }

    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<FailureResult> exception(HttpServerErrorException e) {
        if (e.getStatusCode() == HttpStatus.INTERNAL_SERVER_ERROR) {
            log.error(e.getMessage(), e);
        }
        log.error(e.getMessage(), e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new FailureResult(GeneralErrorType.GENERAL_RUNTIME_EXCEPTION, e.getMessage()));
    }

    @ExceptionHandler(ErrorTypeException.class)
    public ResponseEntity<Object> errorTypeException(ErrorTypeException e) {
        ErrorType errorType = e.getErrorType();

        switch (errorType.getLogLevel()) {
            case INFO -> log.info(e.getMessage(), e);
            case WARN -> log.warn(e.getMessage(), e);
            case ERROR -> log.error(e.getMessage(), e);
            default -> {
            }
        }
        String errorMessage = e.getMessage() + "\nErrorCode : [" + e.getErrorType().getCode() + "]";
        log.error(errorMessage, e);
        return ResponseEntity.status(errorType.getHttpStatus())
                .body(new FailureResult(e.getMessage(), e.getErrorType()));
    }
}