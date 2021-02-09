package com.reto2.channelimprovementwizardv1.service.impl;

import com.reto2.channelimprovementwizardv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.channelimprovementwizardv1.dto.response.CustomerProductImprovementResponse;
import com.reto2.channelimprovementwizardv1.service.Step4Service;
import org.springframework.stereotype.Service;

@Service
public class Step4ServiceImpl implements Step4Service {
    @Override
    public ExistingProductDetailsResponse getExistingProductDetails(String cic, String tioAux) {
        return null;
    }

    @Override
    public NewProductDetailsResponse getNewProductDetails(String tioAux) {
        return null;
    }

    @Override
    public CustomerProductImprovementResponse save(CustomerProductImprovementRequest customerProductImprovementRequest) {
        return null;
    }
}
