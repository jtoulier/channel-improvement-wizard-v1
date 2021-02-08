package com.reto2.channelimprovementwizardv1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBasicInfoResponse {
    CustomerResponse customerResponse;
    List<ProductResponse> newProductList;
    List<ExistingProductResponse> existingProductList;
}
