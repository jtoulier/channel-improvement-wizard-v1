package com.reto2.channelimprovementwizardv1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExistingProductResponse {
    String cic;
    String tioAux;
    String description;
    String details;
}
