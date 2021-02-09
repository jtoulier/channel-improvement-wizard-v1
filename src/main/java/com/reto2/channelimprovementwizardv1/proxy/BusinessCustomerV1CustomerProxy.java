package com.reto2.channelimprovementwizardv1.proxy;

import com.reto2.channelimprovementwizardv1.dto.response.CustomerBasicInfoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "business-customer-v1-customer", url = "${business-customer-v1.url}")
public interface BusinessCustomerV1CustomerProxy {
    @GetMapping("/customer/{card-number}/basic-info")
    CustomerBasicInfoResponse getCustomerBasicInfo(
            @PathVariable("card-number") String cardNumber
    );
}
