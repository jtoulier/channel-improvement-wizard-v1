package com.reto2.channelimprovementwizardv1.controller;

import com.reto2.channelimprovementwizardv1.dto.response.CustomerNewExistingProductsResponse;
import com.reto2.channelimprovementwizardv1.service.Step3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/channel-improvement-wizard-v1")
public class Step3Controller {
    @Autowired
    private Step3Service step3Service;

    @GetMapping("/step3/open/{card-number}")
    public ResponseEntity<CustomerNewExistingProductsResponse> getCustomerNewExistingProducts(
            @PathVariable("card-number") String cardNumber
    ) {
        return new ResponseEntity<>(step3Service.getCustomerNewExistingProducts(cardNumber), HttpStatus.OK);
    }
}
