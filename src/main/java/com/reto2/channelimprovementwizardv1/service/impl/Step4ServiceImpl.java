package com.reto2.channelimprovementwizardv1.service.impl;

import com.reto2.channelimprovementwizardv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.channelimprovementwizardv1.dto.response.*;
import com.reto2.channelimprovementwizardv1.proxy.BusinessImprovementV1CustomerProductImprovementProxy;
import com.reto2.channelimprovementwizardv1.proxy.BusinessImprovementV1ProductImprovementProxy;
import com.reto2.channelimprovementwizardv1.proxy.BusinessProductV1CustomerProductProxy;
import com.reto2.channelimprovementwizardv1.proxy.BusinessProductV1ProductProxy;
import com.reto2.channelimprovementwizardv1.service.Step4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Step4ServiceImpl implements Step4Service {
    @Autowired
    private BusinessProductV1ProductProxy businessProductV1ProductProxy;

    @Autowired
    private BusinessProductV1CustomerProductProxy businessProductV1CustomerProductProxy;

    @Autowired
    private BusinessImprovementV1ProductImprovementProxy businessImprovementV1ProductImprovementProxy;

    @Autowired
    private BusinessImprovementV1CustomerProductImprovementProxy businessImprovementV1CustomerProductImprovementProxy;

    @Override
    public ExistingProductDetailsResponse getExistingProductDetails(String cic, String tioAux) {
        ExistingProductDetailsResponse existingProductDetailsResponse = new ExistingProductDetailsResponse();

        // traer datos del producto en general
        existingProductDetailsResponse.setProductResponse(businessProductV1ProductProxy.findByTioAux(tioAux));

        // traer datos del producto en particular para este cliete
        existingProductDetailsResponse.setCustomerProductResponse(businessProductV1CustomerProductProxy.findByCicTioAux(cic, tioAux));

        // traer la lista de mejorar para un producto
        existingProductDetailsResponse.setProductImprovementResponseList(businessImprovementV1ProductImprovementProxy.findByTioAux(tioAux));

        return existingProductDetailsResponse;
    }

    @Override
    public NewProductDetailsResponse getNewProductDetails(String tioAux) {
        NewProductDetailsResponse newProductDetailsResponse = new NewProductDetailsResponse();

        // traer datos del producto
        newProductDetailsResponse.setProductResponse(businessProductV1ProductProxy.findByTioAux(tioAux));

        // traere las mejoras posibles de este producto
        newProductDetailsResponse.setProductImprovementResponseList(businessImprovementV1ProductImprovementProxy.findByTioAux(tioAux));

        return newProductDetailsResponse;
    }

    @Override
    public CustomerProductImprovementResponse save(CustomerProductImprovementRequest customerProductImprovementRequest) {
        return businessImprovementV1CustomerProductImprovementProxy.save(customerProductImprovementRequest);
    }
}
