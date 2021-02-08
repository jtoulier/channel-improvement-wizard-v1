package com.reto2.channelimprovementwizardv1.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "business-customer-v1-card", url = "${business-customer-v1.url}")
public interface BusinessCustomerV1CardProxy {
    @GetMapping("/card/{card-number}/{internet-password}")
    Boolean validateCard (
            @PathVariable("card-number") String cardNumber,
            @PathVariable("internet-password") String internetPassword
    );
}
