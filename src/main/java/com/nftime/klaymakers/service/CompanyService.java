package com.nftime.klaymakers.service;

import com.nftime.klaymakers.entity.time.CompanyEntity;
import com.nftime.klaymakers.repository.time.CompanyRepository;
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
public class CompanyService {
    private final CompanyRepository companyRepository;
    public List<CompanyEntity> getCompanyList() { return companyRepository.findAll(); }
    public long getCompanyRegisterCount() { return companyRepository.count();}
}
