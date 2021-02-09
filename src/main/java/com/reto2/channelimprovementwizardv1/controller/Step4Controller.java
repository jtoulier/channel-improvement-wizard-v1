package com.reto2.channelimprovementwizardv1.controller;

import com.reto2.channelimprovementwizardv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.channelimprovementwizardv1.dto.response.CustomerProductImprovementResponse;
import com.reto2.channelimprovementwizardv1.dto.response.ExistingProductDetailsResponse;
import com.reto2.channelimprovementwizardv1.dto.response.NewProductDetailsResponse;
import com.reto2.channelimprovementwizardv1.service.Step4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/channel-improvement-wizard-v1")
public class Step4Controller {
    @Autowired
    private Step4Service step4Service;


    @GetMapping("/step4/open/{cic}/existing-product/{tio-aux}")
    public ResponseEntity<ExistingProductDetailsResponse> getExistingProductDetails(
            @PathVariable("cic") String cic,
            @PathVariable("tio-aux") String tioAux
    ) {
        return new ResponseEntity<>(step4Service.getExistingProductDetails(cic, tioAux), HttpStatus.OK);
    }


    @GetMapping("/step4/open/new-product/{tio-aux}")
    public ResponseEntity<NewProductDetailsResponse> getNewProductDetails(
            @PathVariable("tio-aux") String tioAux
    ) {
        return new ResponseEntity<>(step4Service.getNewProductDetails(tioAux), HttpStatus.OK);
    }


    @PostMapping("/step4/next")
    public ResponseEntity<CustomerProductImprovementResponse> saveImprovement(
            @RequestBody CustomerProductImprovementRequest customerProductImprovementRequest
    ) {
        return new ResponseEntity<>(step4Service.save(customerProductImprovementRequest), HttpStatus.OK);
    }
}
