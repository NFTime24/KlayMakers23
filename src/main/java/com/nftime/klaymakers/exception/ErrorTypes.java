package com.nftime.klaymakers.exception;

/**
 * Created by hj.seo@crossangle.io on 2023/11/22
 */
public class ErrorTypes {
    public static void checkCondition(boolean condition, ErrorType errorType, String message) {
        if (!condition) {
            throw new ErrorTypeException(message, errorType);
        }
    }
}