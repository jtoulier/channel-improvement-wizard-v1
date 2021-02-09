package com.reto2.channelimprovementwizardv1.service.impl;

import com.reto2.channelimprovementwizardv1.dto.response.ProductImprovementResponse;
import com.reto2.channelimprovementwizardv1.dto.response.ProductImprovementResultResponse;
import com.reto2.channelimprovementwizardv1.proxy.BusinessImprovementV1ProductImprovementProxy;
import com.reto2.channelimprovementwizardv1.service.Step5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Step5ServiceImpl implements Step5Service {
    @Autowired
    private BusinessImprovementV1ProductImprovementProxy businessImprovementV1ProductImprovementProxy;

    @Override
    public ProductImprovementResultResponse getProductImprovement(String productImprovementId) {
        ProductImprovementResultResponse productImprovementResultResponse = new ProductImprovementResultResponse();

        ProductImprovementResponse productImprovementResponse = businessImprovementV1ProductImprovementProxy.findByProductImprovementId(productImprovementId);

        productImprovementResultResponse.setProductImprovementId(productImprovementResponse.getProductImprovementId());
        productImprovementResultResponse.setDaysEffort(productImprovementResponse.getDaysEffort());

        return productImprovementResultResponse;
    }
}
