package com.reto2.channelimprovementwizardv1.proxy.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerProductImprovementRequest {
    private String cic;
    private String tioAux;
    private Short productImprovementId;
    private String description;
}
