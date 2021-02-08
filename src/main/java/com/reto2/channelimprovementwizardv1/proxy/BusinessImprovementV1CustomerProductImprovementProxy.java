package com.reto2.channelimprovementwizardv1.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "business-improvement-v1-customer-product-improvement", url = "${business-improvement-v1.url}")
public interface BusinessImprovementV1CustomerProductImprovementProxy {
}
