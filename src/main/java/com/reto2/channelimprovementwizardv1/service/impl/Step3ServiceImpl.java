package com.reto2.channelimprovementwizardv1.service.impl;

import com.reto2.channelimprovementwizardv1.dto.response.*;
import com.reto2.channelimprovementwizardv1.proxy.BusinessCustomerV1CustomerProxy;
import com.reto2.channelimprovementwizardv1.proxy.BusinessProductV1CustomerProxy;
import com.reto2.channelimprovementwizardv1.service.Step3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Step3ServiceImpl implements Step3Service {
    @Autowired
    private BusinessCustomerV1CustomerProxy businessCustomerV1CustomerProxy;

    @Autowired
    private BusinessProductV1CustomerProxy businessProductV1CustomerProxy;

    @Override
    public CustomerNewExistingProductsResponse getCustomerNewExistingProducts(String cardNumber) {
        CustomerNewExistingProductsResponse customerNewExistingProductsResponse = new CustomerNewExistingProductsResponse();

        // obtener datos del customer
        CustomerBasicInfoResponse customerBasicInfoResponseFromProxy =
            businessCustomerV1CustomerProxy.getCustomerBasicInfo(cardNumber);

        if (customerBasicInfoResponseFromProxy != null) {
            // mapear datos del cliente
            CustomerResponse customerResponse = new CustomerResponse();
            customerResponse.setCic(customerBasicInfoResponseFromProxy.getCic());
            customerResponse.setDni(customerBasicInfoResponseFromProxy.getDni());
            customerResponse.setFirstSurname(customerBasicInfoResponseFromProxy.getFirstSurname());
            customerResponse.setSecondSurname(customerBasicInfoResponseFromProxy.getSecondSurname());
            customerResponse.setGivenName(customerBasicInfoResponseFromProxy.getGivenName());
            customerNewExistingProductsResponse.setCustomerResponse(customerResponse);

            // obtener productos nuevos y existentes del proxy
            String cic = customerBasicInfoResponseFromProxy.getCic();

            ProductsForCustomerResponse productsForCustomerResponse = businessProductV1CustomerProxy.getProductsForCustomer(cic);

            if (productsForCustomerResponse != null) {
                // mapear los nuevos productos
                customerNewExistingProductsResponse.setNewProductList(productsForCustomerResponse.getNewProductResponseList());

                // mapear los existentes
                customerNewExistingProductsResponse.setExistingProductList(productsForCustomerResponse.getExistingProductResponseList());
            }
        }

        return customerNewExistingProductsResponse;
    }
}
