package com.nftime.klaymakers.service.certificate;

import com.nftime.klaymakers.entity.time.CertificateEntity;
import com.nftime.klaymakers.exception.CustomErrorType;
import com.nftime.klaymakers.exception.ErrorTypeException;
import com.nftime.klaymakers.model.certificate.result.CertificateModel;
import com.nftime.klaymakers.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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
            throw new ErrorTypeException("CERTIFICATE_LIST_NOT_FOUND_ERROR", CustomErrorType.CERTIFICATE_LIST_NOT_FOUND_ERROR);
        }
        List<CertificateModel> certificateModelList = certificateEntityList.stream()
                .map(CertificateModel::new).toList();
        return certificateModelList;
    }

    public CertificateModel getCertificate(long certificateId) {
        CertificateEntity certificateEntity = certificateService.getCertificateById(certificateId)
                .orElseThrow(() -> new ErrorTypeException("CERTIFICATE_NOT_FOUND_ERROR", CustomErrorType.CERTIFICATE_NOT_FOUND_ERROR));

        return new CertificateModel(certificateEntity);
    }
}
