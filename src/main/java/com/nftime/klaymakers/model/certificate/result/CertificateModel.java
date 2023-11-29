package com.nftime.klaymakers.model.certificate.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nftime.klaymakers.entity.time.CertificateEntity;
import com.nftime.klaymakers.model.base.BaseObject;
import lombok.*;

import java.io.Serial;
import java.time.Instant;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class CertificateModel extends BaseObject {
    @Serial
    private static final long serialVersionUID = -1418187205649554813L;
    @JsonProperty(required = true)
    private long id;

    @JsonProperty(required = true)
    private String image;

    @JsonProperty(required = true)
    private String companyName;

    @JsonProperty(required = true)
    private String category;

    @JsonProperty(required = true)
    private String name;

    @JsonProperty(required = true)
    private String description;

    @JsonProperty(required = true)
    private String website;

    @JsonProperty(required = true)
    private Instant registerDate;

    @JsonProperty(required = true)
    private Instant startDate;

    @JsonProperty(required = true)
    private Instant endDate;

    @JsonProperty()
    private Instant issuedDate; // 발행된 날짜 - 단건

    @JsonProperty()
    private long issuedCount; // 발행된 개수 - 목록

    public CertificateModel(CertificateEntity c) {
        this.id = c.getId();
        this.image = c.getCertificateImage();
        this.companyName = c.getCompanyName();
        this.category = c.getCertificateCategory();
        this.name = c.getCertificateName();
        this.description = c.getCertificateDescription();
        this.website = c.getCertificateWebsite();
        this.registerDate = c.getCreatedAt();
        this.startDate = c.getCertificateStartDate();
        this.endDate = c.getCertificateEndDate();
        this.issuedDate = null; // todo: 발행된 날짜
        this.issuedCount = 0; // todo: 발행된 개수
    }
}
