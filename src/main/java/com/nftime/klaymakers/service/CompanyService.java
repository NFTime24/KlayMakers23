package com.nftime.klaymakers.service;

import com.nftime.klaymakers.repository.time.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class CompanyService {
    private final CompanyRepository companyRepository;
}
