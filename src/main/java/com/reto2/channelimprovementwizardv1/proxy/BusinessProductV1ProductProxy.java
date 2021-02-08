package com.reto2.channelimprovementwizardv1.proxy;

import com.reto2.channelimprovementwizardv1.proxy.dto.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "business-product-v1-product", url = "${business-product-v1.url}")
public interface BusinessProductV1ProductProxy {
    @GetMapping("/product/{tio-aux}")
    ProductResponse findByTioAux(
            @PathVariable("tio-aux") String tioAux
    );
}
