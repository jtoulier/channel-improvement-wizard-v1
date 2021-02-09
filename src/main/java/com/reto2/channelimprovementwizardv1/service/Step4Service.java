package com.reto2.channelimprovementwizardv1.service;

import com.reto2.channelimprovementwizardv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.channelimprovementwizardv1.dto.response.CustomerProductImprovementResponse;
import com.reto2.channelimprovementwizardv1.dto.response.ExistingProductDetailsResponse;
import com.reto2.channelimprovementwizardv1.dto.response.NewProductDetailsResponse;

public interface Step4Service {
    ExistingProductDetailsResponse getExistingProductDetails(String cic, String tioAux);
    NewProductDetailsResponse getNewProductDetails(String tioAux);
    CustomerProductImprovementResponse save(CustomerProductImprovementRequest customerProductImprovementRequest);
}
