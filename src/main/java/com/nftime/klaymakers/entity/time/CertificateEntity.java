package com.nftime.klaymakers.entity.time;

import com.querydsl.core.annotations.QueryEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */
@Entity
@QueryEntity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "certificate")
public class CertificateEntity {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "certificate_image", nullable = false)
    private String certificateImage;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "certificate_category", nullable = false)
    private String certificateCategory;

    @Column(name = "certificate_name", nullable = false)
    private String certificateName;

    @Column(name = "certificate_description", nullable = false)
    private String certificateDescription;

    @Column(name = "certificate_website", nullable = false)
    private String certificateWebsite;

    @Column(name = "certificate_start_date", nullable = false)
    private Instant certificateStartDate;

    @Column(name = "certificate_end_date", nullable = false)
    private Instant certificateEndDate;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}