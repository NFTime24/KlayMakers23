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
@Table(name = "certificate_user")
public class CertificateUserEntity {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "certificate_id", nullable = false)
    private long certificateId;

    @Column(name = "user_wallet_address", nullable = false)
    private String userWalletAddress;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}