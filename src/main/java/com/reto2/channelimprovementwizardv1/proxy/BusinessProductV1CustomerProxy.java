package com.reto2.channelimprovementwizardv1.proxy;

import com.reto2.channelimprovementwizardv1.dto.response.ProductsForCustomerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "business-product-v1-customer", url = "${business-product-v1.url}")
public interface BusinessProductV1CustomerProxy {
    @GetMapping("/customer/{cic}/products-for-customer")
    ProductsForCustomerResponse getProductsForCustomer(
            @PathVariable("cic") String cic
    );
}
