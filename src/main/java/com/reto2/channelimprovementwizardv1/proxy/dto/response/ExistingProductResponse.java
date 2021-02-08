package com.reto2.channelimprovementwizardv1.proxy.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExistingProductResponse {
    private String cic;
    private String tioAux;
    private String description;
    private String details;
}
