package com.nftime.klaymakers.controller;

import com.nftime.klaymakers.model.result.ApiResponse;
import com.nftime.klaymakers.model.result.CertificateModel;
import com.nftime.klaymakers.service.CertificateFacadeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */

@RestController
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Certificate", description = "인증서 관련 API")
@RequestMapping("/certificate")
public class CertificateController {
    private final CertificateFacadeService certificateFacadeService;

    @Operation(summary="인증서 목록", description="인증서 목록 출력")
    @GetMapping(path="/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<List<CertificateModel>> getCertificateList() {
        List<CertificateModel> result = certificateFacadeService.getCertificateList();
        return new ApiResponse<>(result);
    }

    @Operation(summary="인증서 단건", description="인증서 단건 출력")
    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<CertificateModel> getCertificate(long certificateId) {
        CertificateModel result = certificateFacadeService.getCertificate(certificateId);
        return new ApiResponse<>(result);
    }
}
