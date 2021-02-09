package com.reto2.channelimprovementwizardv1.service;

import com.reto2.channelimprovementwizardv1.dto.response.CustomerNewExistingProductsResponse;

public interface Step3Service {
    CustomerNewExistingProductsResponse getCustomerNewExistingProducts(String cardNumber);
}
