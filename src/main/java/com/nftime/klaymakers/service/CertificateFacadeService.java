package com.nftime.klaymakers.service;

import com.nftime.klaymakers.entity.time.CertificateEntity;
import com.nftime.klaymakers.entity.time.UserEntity;
import com.nftime.klaymakers.exception.CustomErrorType;
import com.nftime.klaymakers.exception.ErrorTypeException;
import com.nftime.klaymakers.model.result.CertificateModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */

@Service
@Slf4j
@RequiredArgsConstructor
public class CertificateFacadeService {
    private final CertificateService certificateService;
    private final UserService userService;

    public List<CertificateModel> getCertificateList() {
        List<CertificateEntity> certificateEntityList = certificateService.getCertificateList();
        if (certificateEntityList.isEmpty()) {
            throw new ErrorTypeException("CATEGORY_LIST_NOT_FOUND_ERROR", CustomErrorType.CATEGORY_LIST_NOT_FOUND_ERROR);
        }
        List<CertificateModel> certificateModelList = certificateEntityList.stream()
                .map(certificateEntity -> new CertificateModel(
                        certificateEntity.getId()
                )).toList();
        return certificateModelList;
    }
}
