package com.reto2.channelimprovementwizardv1.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "business-customer-v1-card", url = "${business-customer-v1.url}")
public interface BusinessCustomerV1CardProxy {
}
