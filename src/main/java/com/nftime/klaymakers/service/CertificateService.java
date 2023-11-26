package com.nftime.klaymakers.service;

import com.nftime.klaymakers.entity.time.CertificateEntity;
import com.nftime.klaymakers.entity.time.UserEntity;
import com.nftime.klaymakers.repository.time.CertificateRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class CertificateService {
    private final CertificateRepository certificateRepository;
    public List<CertificateEntity> getCertificateList(){
        return certificateRepository.findAll();
    }
}
