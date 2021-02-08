package com.reto2.channelimprovementwizardv1.proxy;

import com.reto2.channelimprovementwizardv1.proxy.dto.response.ProductImprovementResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "business-improvement-v1-product-improvement", url = "${business-improvement-v1.url}")
public interface BusinessImprovementV1ProductImprovementProxy {
    @GetMapping("/product/{tio-aux}/product-improvement")
    List<ProductImprovementResponse> findByTioAux(
            @PathVariable("tio-aux") String tioAux
    );

    @GetMapping("/product-improvement/{product-improvement-id}")
    ProductImprovementResponse findByProductImprovementId(
            @PathVariable("product-improvement-id") String productImprovementId
    );
}
