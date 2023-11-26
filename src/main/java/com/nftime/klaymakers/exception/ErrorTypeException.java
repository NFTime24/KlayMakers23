package com.nftime.klaymakers.exception;

import java.io.Serial;

/**
 * Created by hj.seo@crossangle.io on 2023/08/17
 */
public class ErrorTypeException extends RuntimeException {


    @Serial
    private static final long serialVersionUID = 3600318302499573480L;
    protected ErrorType errorType;

    public ErrorTypeException(String message, ErrorType errorType) {
        super(message);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public String getVal() {
        return this.errorType.getVal();
    }
}
