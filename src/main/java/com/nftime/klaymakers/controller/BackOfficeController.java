package com.nftime.klaymakers.controller;

import com.nftime.klaymakers.model.result.ApiResponse;
import com.nftime.klaymakers.model.result.StatModel;
import com.nftime.klaymakers.service.StatFacadeService;
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
    private final StatFacadeService statFacadeService;

    // todo: 로그인 API & post API 구현

    @Operation(summary="company 등록", description="company 단건 등록")
    @PostMapping(path="/company/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<String> registerCompany() {
        return new ApiResponse<>("success");
    }

    @Operation(summary="certificate 등록", description="certificate 단건 등록")
    @PostMapping(path="/certificate/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<String> registerCertificate() {
        return new ApiResponse<>("success");
    }

    @Operation(summary="certificate 발행", description="ccertificate 발행")
    @PostMapping(path="/certificate/issue", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<String> issueCertificate() {
        return new ApiResponse<>("success");
    }

    @Operation(summary = "통계", description = "업체/인증서 관련 통계 출력")
    @GetMapping(path = "/stat", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<StatModel> getStat() {
        StatModel result = statFacadeService.getStat();
        return new ApiResponse<>(result);
    }
}