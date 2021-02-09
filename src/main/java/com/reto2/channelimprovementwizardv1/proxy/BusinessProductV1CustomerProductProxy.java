package com.reto2.channelimprovementwizardv1.proxy;

import com.reto2.channelimprovementwizardv1.dto.response.CustomerProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "business-product-v1-customer-product", url = "${business-product-v1.url}")
public interface BusinessProductV1CustomerProductProxy {
    @GetMapping("/customer/{cic}/product/{tio-aux}")
    CustomerProductResponse findByCicTioAux(
            @PathVariable("cic") String cic,
            @PathVariable("tio-aux") String tioAux
    );
}
