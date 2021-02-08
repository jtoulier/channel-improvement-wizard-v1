package com.reto2.channelimprovementwizardv1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private String cic;
    private String dni;
    private String firstSurname;
    private String secondSurname;
    private String givenName;
}