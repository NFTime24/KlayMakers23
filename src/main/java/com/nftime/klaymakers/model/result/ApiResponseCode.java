package com.nftime.klaymakers.model.result;

import java.io.Serializable;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */
public interface ApiResponseCode extends Serializable {

    enum StatusCode {
        OK,
        ERROR
    }

    StatusCode getStatusCode();

    String getMessage();

}