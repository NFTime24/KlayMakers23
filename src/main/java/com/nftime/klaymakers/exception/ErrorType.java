package com.nftime.klaymakers.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by hj.seo@crossangle.io on 2023/08/17
 */
public interface ErrorType {
    int getCode();
    HttpStatus getHttpStatus();
    ErrorLogLevel getLogLevel();
    String getVal();
}
