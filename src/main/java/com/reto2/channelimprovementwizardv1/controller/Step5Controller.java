package com.reto2.channelimprovementwizardv1.controller;

import com.reto2.channelimprovementwizardv1.dto.response.ProductImprovementResultResponse;
import com.reto2.channelimprovementwizardv1.service.Step5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/channel-improvement-wizard-v1")
public class Step5Controller {
    @Autowired
    private Step5Service step5Service;


    @GetMapping("/step5/open/{product-improvement-id}")
    public ResponseEntity<ProductImprovementResultResponse> getProductImprovement(
            @PathVariable("product-improvement-id") String productImprovementId
    ) {
        return new ResponseEntity<>(step5Service.getProductImprovement(productImprovementId), HttpStatus.OK);
    }
}
