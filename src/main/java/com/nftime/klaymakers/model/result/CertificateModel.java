package com.nftime.klaymakers.model.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nftime.klaymakers.model.base.BaseObject;
import lombok.*;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class CertificateModel extends BaseObject {
    @JsonProperty(required = true)
    private long id;
}
