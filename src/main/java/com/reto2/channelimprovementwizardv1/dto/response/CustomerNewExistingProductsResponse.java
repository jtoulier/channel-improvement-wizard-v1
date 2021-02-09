package com.reto2.channelimprovementwizardv1.dto.response;

import com.reto2.channelimprovementwizardv1.dto.response.CustomerResponse;
import com.reto2.channelimprovementwizardv1.dto.response.ExistingProductResponse;
import com.reto2.channelimprovementwizardv1.dto.response.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerNewExistingProductsResponse {
    CustomerResponse customerResponse;
    List<ProductResponse> newProductList;
    List<ExistingProductResponse> existingProductList;
}
