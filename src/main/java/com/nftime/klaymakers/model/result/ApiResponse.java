package com.nftime.klaymakers.model.result;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */
public class ApiResponse<T> implements ApiResponseCode {

    @Serial
    private static final long serialVersionUID = 3329139989109380358L;
    @JsonProperty(required = true)
    private StatusCode statusCode;

    @JsonProperty(required = true)
    private String message;

    @JsonProperty(required = true)
    private T result;

    public ApiResponse() {
        this.statusCode = StatusCode.OK;
    }

    public ApiResponse(T result) {
        this.statusCode = StatusCode.OK;
        this.result = result;
    }

    public ApiResponse(StatusCode statusCode, String message) {
        this(statusCode, message, null);
    }

    public ApiResponse(StatusCode statusCode, String message, T result) {
        this.statusCode = StatusCode.OK;
        this.statusCode = statusCode;
        this.message = message;
        this.result = result;
    }

    public StatusCode getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    }
}