package com.reto2.channelimprovementwizardv1.proxy.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsForCustomerResponse {
    private List<ProductResponse> newProductResponseList;
    private List<ExistingProductResponse> existingProductResponseList;
}
