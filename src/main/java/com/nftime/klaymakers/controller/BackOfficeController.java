package com.nftime.klaymakers.controller;

import com.nftime.klaymakers.model.result.ApiResponse;
import com.nftime.klaymakers.model.result.ApiResponseCode;
import com.nftime.klaymakers.model.stat.result.StatModel;
import com.nftime.klaymakers.service.certificate.CertificateFacadeService;
import com.nftime.klaymakers.service.company.CompanyFacadeService;
import com.nftime.klaymakers.service.stat.StatFacadeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@Tag(name = "BackOffice", description = "백오피스 API")
@RequestMapping("/back-office")
public class BackOfficeController {
    private final CompanyFacadeService companyFacadeService;
    private final CertificateFacadeService certificateFacadeService;
    private final StatFacadeService statFacadeService;

    @Operation(summary = "로그인", description = "관리자 로그인")
    @PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<ApiResponseCode.StatusCode> login() {
        return new ApiResponse<>(ApiResponseCode.StatusCode.OK);
    }

    @Operation(summary = "company 등록", description = "company 단건 등록")
    @PostMapping(path = "/company/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<ApiResponseCode.StatusCode> registerCompany() {
        return new ApiResponse<>(ApiResponseCode.StatusCode.OK);
    }

    @Operation(summary = "certificate 등록", description = "certificate 단건 등록")
    @PostMapping(path = "/certificate/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<ApiResponseCode.StatusCode> registerCertificate() {
        return new ApiResponse<>(ApiResponseCode.StatusCode.OK);
    }

    @Operation(summary = "certificate 발행", description = "certificate 발행")
    @PostMapping(path = "/certificate/issue", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<ApiResponseCode.StatusCode> issueCertificate() {
        return new ApiResponse<>(ApiResponseCode.StatusCode.OK);
    }

    @Operation(summary = "통계", description = "업체/인증서 관련 통계 출력")
    @GetMapping(path = "/stat", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<StatModel> getStat() {
        StatModel result = statFacadeService.getStat();
        return new ApiResponse<>(result);
    }
}