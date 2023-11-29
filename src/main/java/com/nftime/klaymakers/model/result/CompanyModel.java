package com.nftime.klaymakers.model.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nftime.klaymakers.entity.time.CompanyEntity;
import com.nftime.klaymakers.model.base.BaseObject;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class CompanyModel extends BaseObject {
    @JsonProperty(required = true)
    private long id;

    @JsonProperty(required = true)
    private String image;

    @JsonProperty(required = true)
    private String name;

    @JsonProperty(required = true)
    private String description;

    @JsonProperty(required = true)
    private String website;

    @JsonProperty(required = true)
    private Instant registerDate; // company 등록 날짜

    @JsonProperty(required = true)
    private long certificateRegisterCount;

    @JsonProperty(required = true)
    private long certificateIssueCount;

    public CompanyModel(CompanyEntity c) {
        this.id = c.getId();
        this.image = c.getCompanyImage();
        this.name = c.getCompanyName();
        this.description = c.getCompanyDescription();
        this.website = c.getCompanyWebsite();
        this.registerDate = c.getCreatedAt();
        this.certificateRegisterCount = 0; // todo: 인증서 등록 개수
        this.certificateIssueCount = 0; // todo: 인증서 발행 개수
    }
}
