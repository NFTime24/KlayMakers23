package com.nftime.klaymakers.service.stat;

import com.nftime.klaymakers.model.stat.result.StatModel;
import com.nftime.klaymakers.service.CertificateUserService;
import com.nftime.klaymakers.service.certificate.CertificateService;
import com.nftime.klaymakers.service.company.CompanyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class StatFacadeService {
    private final CompanyService companyService;
    private final CertificateService certificateService;
    private final CertificateUserService certificateUserService;

    public StatModel getStat() {
        long companyRegisterCount = companyService.getCompanyRegisterCount();
        long certificateRegisterCount = certificateService.getCertificateRegisterCount();
        long certificateIssueCount = certificateUserService.getCertificateIssueCount();

        return new StatModel(companyRegisterCount, certificateRegisterCount, certificateIssueCount);
    }
}
