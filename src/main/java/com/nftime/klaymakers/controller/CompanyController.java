package com.nftime.klaymakers.controller;

import com.nftime.klaymakers.model.result.ApiResponse;
import com.nftime.klaymakers.model.company.result.CompanyModel;
import com.nftime.klaymakers.service.company.CompanyFacadeService;
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
@Tag(name = "Company", description = "회사 관련 API")
@RequestMapping("/company")
public class CompanyController {
    private final CompanyFacadeService companyFacadeService;

    @Operation(summary = "회사 목록", description = "회사 목록 출력")
    @GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<List<CompanyModel>> getCompanyList() {
        List<CompanyModel> result = companyFacadeService.getCompanyList();
        return new ApiResponse<>(result);
    }
}
