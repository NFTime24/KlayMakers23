package com.nftime.klaymakers.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nftime.klaymakers.model.base.BaseObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;

import java.io.Serial;

/**
 * Created by dukedev1004@crossangle.io on 11/27/23
 */
public class FailureResult extends BaseObject {

    @Serial
    private static final long serialVersionUID = -1683351707148068201L;
    @JsonProperty(required = true)
    private long timestamp;
    @JsonProperty(required = true)
    private int status;
    @JsonProperty(required = true)
    private int errorCode;
    @JsonProperty(required = true)
    private String message;
    @JsonProperty(required = true)
    private String val;

    public FailureResult() {
        this(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public FailureResult(GeneralErrorType generalErrorType, String message) {
        this.errorCode = generalErrorType.getCode();
        this.message = message;
        this.status = generalErrorType.getHttpStatus().value();
        this.timestamp = System.currentTimeMillis();
        this.val = "";
    }

    public FailureResult(ErrorTypeException errorTypeException) {
        this.errorCode = errorTypeException.getErrorType().getCode();
        this.message = errorTypeException.getMessage();
        this.status = errorTypeException.getErrorType().getHttpStatus().value();
        this.timestamp = System.currentTimeMillis();
        this.val = errorTypeException.getVal();
    }

    public FailureResult(String message, ErrorType errorType) {
        this.errorCode = errorType.getCode();
        this.message = message;
        this.status = errorType.getHttpStatus().value();
        this.timestamp = System.currentTimeMillis();
        this.val = errorType.getVal();
    }

    public FailureResult(String message, ErrorType errorType, HttpStatus httpStatus) {
        this.errorCode = errorType.getCode();
        this.message = message;
        this.status = httpStatus.value();
        this.timestamp = System.currentTimeMillis();
        this.val = errorType.getVal();
    }

    public FailureResult(HttpStatus httpStatus) {
        this.errorCode = httpStatus.value();
        this.message = httpStatus.getReasonPhrase();
        this.status = httpStatus.hashCode();
        this.timestamp = System.currentTimeMillis();
        this.val = "";
    }

    public FailureResult(MissingServletRequestParameterException e) {
        this.errorCode = e.getBody().getStatus();
        this.message = e.getBody().getDetail();
        this.status = e.getBody().getStatus();
        this.timestamp = System.currentTimeMillis();
        this.val = e.getParameterName();
    }

    public long getTimestamp() {
        return timestamp;
    }
    public int getErrorCode() {
        return errorCode;
    }
    public String getMessage() {
        return message;
    }
    public int getStatus() {
        return status;
    }
    public String getVal() {
        return val;
    }
}