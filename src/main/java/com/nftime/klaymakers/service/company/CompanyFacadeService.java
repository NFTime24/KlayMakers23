package com.nftime.klaymakers.service.company;

import com.nftime.klaymakers.entity.time.CompanyEntity;
import com.nftime.klaymakers.exception.CustomErrorType;
import com.nftime.klaymakers.exception.ErrorTypeException;
import com.nftime.klaymakers.model.company.result.CompanyModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CompanyFacadeService {
    private final CompanyService companyService;

    public List<CompanyModel> getCompanyList() {
        List<CompanyEntity> companyEntityList = companyService.getCompanyList();
        if (companyEntityList.isEmpty()) {
            throw new ErrorTypeException("COMPANY_LIST_NOT_FOUND_ERROR", CustomErrorType.COMPANY_LIST_NOT_FOUND_ERROR);
        }
        List<CompanyModel> companyModelList = companyEntityList.stream()
                .map(CompanyModel::new).toList();
        return companyModelList;
    }
}
