package com.reto2.channelimprovementwizardv1.proxy.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBasicInfoResponse {
    private String cardNumber;
    private String cic;
    private String dni;
    private String firstSurname;
    private String secondSurname;
    private String givenName;
}