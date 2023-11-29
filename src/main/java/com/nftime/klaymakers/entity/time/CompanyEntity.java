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
@Table(name = "company")
public class CompanyEntity {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "company_image", nullable = false)
    private String companyImage;

    @Column(name = "company_description", nullable = false)
    private String companyDescription;

    @Column(name = "company_website", nullable = false)
    private String companyWebsite;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}