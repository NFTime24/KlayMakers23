package com.nftime.klaymakers.service;


import com.nftime.klaymakers.repository.time.CertificateUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CertificateUserService {
    private final CertificateUserRepository certificateUserRepository;
    public long getCertificateIssueCount() { return certificateUserRepository.count();}
}
