package com.reto2.channelimprovementwizardv1.dto.response;

import com.reto2.channelimprovementwizardv1.dto.response.ExistingProductResponse;
import com.reto2.channelimprovementwizardv1.dto.response.ProductResponse;
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
