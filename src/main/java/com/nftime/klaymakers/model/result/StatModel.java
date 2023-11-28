package com.nftime.klaymakers.model.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nftime.klaymakers.model.base.BaseObject;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class StatModel extends BaseObject {
    @JsonProperty(required = true)
    private long companyRegisterCount;

    @JsonProperty(required = true)
    private long certificateRegisterCount;

    @JsonProperty(required = true)
    private long certificateIssueCount;
}
