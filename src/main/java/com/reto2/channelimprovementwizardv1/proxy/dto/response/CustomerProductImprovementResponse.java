package com.reto2.channelimprovementwizardv1.proxy.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerProductImprovementResponse {
    private Integer customerProductImprovementId;
    private String cic;
    private String tioAux;
    private Short productImprovementId;
    private String description;
}
