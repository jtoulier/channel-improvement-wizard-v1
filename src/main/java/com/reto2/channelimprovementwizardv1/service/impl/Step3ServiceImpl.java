package com.reto2.channelimprovementwizardv1.service.impl;

import com.reto2.channelimprovementwizardv1.dto.response.CustomerResponse;
import com.reto2.channelimprovementwizardv1.dto.response.ProductResponse;
import com.reto2.channelimprovementwizardv1.dto.response.step3controller.CustomerNewExistingProductsResponse;
import com.reto2.channelimprovementwizardv1.proxy.BusinessCustomerV1CustomerProxy;
import com.reto2.channelimprovementwizardv1.proxy.BusinessProductV1CustomerProxy;
import com.reto2.channelimprovementwizardv1.proxy.dto.response.ProductsForCustomerResponse;
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
    public CustomerNewExistingProductsResponse getCustomerProducts(String cardNumber) {
        CustomerNewExistingProductsResponse customerNewExistingProductsResponse = new CustomerNewExistingProductsResponse();

        // obtener datos del customer
        com.reto2.channelimprovementwizardv1.proxy.dto.response.CustomerBasicInfoResponse customerBasicInfoResponseFromProxy =
            businessCustomerV1CustomerProxy.getCustomerBasicInfo(cardNumber);

        if (customerBasicInfoResponseFromProxy != null) {
            // mapear datos del cliente
            CustomerResponse customerResponse = new CustomerResponse();
            customerResponse.setCic(customerBasicInfoResponseFromProxy.getCic());
            customerResponse.setDni(customerBasicInfoResponseFromProxy.getDni());
            customerResponse.setFirstSurname(customerBasicInfoResponseFromProxy.getFirstSurname());
            customerResponse.setSecondSurname(customerBasicInfoResponseFromProxy.getSecondSurname());
            customerResponse.setGivenName(customerBasicInfoResponseFromProxy.getGivenName());

            // obtener productos nuevos y existentes del proxy
            String cic = customerBasicInfoResponseFromProxy.getCic();

            ProductsForCustomerResponse productsForCustomerResponse = businessProductV1CustomerProxy.getProductsForCustomer(cic);

            // mapear los nuevos productos
            List<ProductResponse> newProductResponseList = productsForCustomerResponse.getNewProductResponseList();

            if (newProductResponseList != null) {
                customerNewExistingProductsResponse.setNewProductList(newProductResponseList);
            }
        }


        return customerNewExistingProductsResponse;
    }
}
