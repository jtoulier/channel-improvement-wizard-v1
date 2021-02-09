package com.reto2.channelimprovementwizardv1.service;

import com.reto2.channelimprovementwizardv1.dto.response.step3controller.CustomerNewExistingProductsResponse;

public interface Step3Service {
    CustomerNewExistingProductsResponse getCustomerProducts(String cardNumber);
}
