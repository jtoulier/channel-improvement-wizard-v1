package com.reto2.channelimprovementwizardv1.proxy;

import com.reto2.channelimprovementwizardv1.proxy.dto.request.CustomerProductImprovementRequest;
import com.reto2.channelimprovementwizardv1.proxy.dto.response.CustomerProductImprovementResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "business-improvement-v1-customer-product-improvement", url = "${business-improvement-v1.url}")
public interface BusinessImprovementV1CustomerProductImprovementProxy {
    @PostMapping("/customer-product-improvement")
    CustomerProductImprovementResponse save(
            @RequestBody CustomerProductImprovementRequest customerProductImprovementRequest
            );
}
