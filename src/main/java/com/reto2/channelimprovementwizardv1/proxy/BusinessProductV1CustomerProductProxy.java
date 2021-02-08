package com.reto2.channelimprovementwizardv1.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "business-product-v1-customer-product", url = "${business-product-v1.url}")
public interface BusinessProductV1CustomerProductProxy {
}
