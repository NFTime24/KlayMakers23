package com.nftime.klaymakers.model.stat.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nftime.klaymakers.model.base.BaseObject;
import lombok.*;

import java.io.Serial;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class StatModel extends BaseObject {
    @Serial
    private static final long serialVersionUID = -2855527079122682835L;

    @JsonProperty(required = true)
    private long companyRegisterCount;

    @JsonProperty(required = true)
    private long certificateRegisterCount;

    @JsonProperty(required = true)
    private long certificateIssueCount;
}
