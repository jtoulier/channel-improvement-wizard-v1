package com.reto2.channelimprovementwizardv1.dto.response.step4controller;

import com.reto2.channelimprovementwizardv1.dto.response.CustomerProductResponse;
import com.reto2.channelimprovementwizardv1.dto.response.ProductImprovementResponse;
import com.reto2.channelimprovementwizardv1.dto.response.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExistingProductDetailsResponse {
    private ProductResponse productResponse;
    private CustomerProductResponse customerProductResponse;
    private List<ProductImprovementResponse> productImprovementResponseList;
}
