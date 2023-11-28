package com.nftime.klaymakers.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by dukedev1004@crossangle.io on 11/27/23
 */
public enum CustomErrorType implements ErrorType {
    // General 0~99

    // Certificate 100~199
    CERTIFICATE_LIST_NOT_FOUND_ERROR(100, HttpStatus.NOT_FOUND),
    CERTIFICATE_NOT_FOUND_ERROR(101, HttpStatus.NOT_FOUND),

    // Company 200~299
    COMPANY_LIST_NOT_FOUND_ERROR(200, HttpStatus.NOT_FOUND),
    COMPANY_NOT_FOUND_ERROR(201, HttpStatus.NOT_FOUND),
    ;


    private final int code;
    private final HttpStatus httpStatus;
    private final ErrorLogLevel logLevel;
    private final String val;

    CustomErrorType(int code) {
        this.code = code;
        this.httpStatus = HttpStatus.BAD_REQUEST;
        this.logLevel = ErrorLogLevel.ERROR;
        this.val = "";
    }

    CustomErrorType(int code, HttpStatus httpStatus) {
        this.code = code;
        this.logLevel = ErrorLogLevel.ERROR;
        this.httpStatus = httpStatus;
        this.val = "";
    }

    CustomErrorType(int code, HttpStatus httpStatus, ErrorLogLevel level) {
        this.code = code;
        this.logLevel = level;
        this.httpStatus = httpStatus;
        this.val = "";
    }

    CustomErrorType(int code, HttpStatus httpStatus, ErrorLogLevel level, String val) {
        this.code = code;
        this.logLevel = level;
        this.httpStatus = httpStatus;
        this.val = val;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public ErrorLogLevel getLogLevel() {
        return this.logLevel;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getVal() {
        return val;
    }
}