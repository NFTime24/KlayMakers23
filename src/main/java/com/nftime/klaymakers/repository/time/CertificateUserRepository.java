package com.nftime.klaymakers.repository.time;

import com.nftime.klaymakers.entity.time.CertificateEntity;
import com.nftime.klaymakers.entity.time.CertificateUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */
@Repository
public interface CertificateUserRepository extends JpaRepository<CertificateUserEntity, Long>, QuerydslPredicateExecutor<CertificateUserEntity> {
}