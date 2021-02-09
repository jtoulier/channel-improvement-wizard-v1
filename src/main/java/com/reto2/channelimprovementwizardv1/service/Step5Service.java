package com.reto2.channelimprovementwizardv1.service;

import com.reto2.channelimprovementwizardv1.dto.response.ProductImprovementResponse;
import com.reto2.channelimprovementwizardv1.dto.response.ProductImprovementResultResponse;

public interface Step5Service {
    ProductImprovementResultResponse getProductImprovement(String productImprovementId);
}
