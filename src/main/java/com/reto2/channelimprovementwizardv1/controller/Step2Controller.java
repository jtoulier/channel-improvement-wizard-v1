package com.reto2.channelimprovementwizardv1.controller;

import com.reto2.channelimprovementwizardv1.service.Step2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/channel-improvement-wizard-v1")
public class Step2Controller {
    @Autowired
    private Step2Service step2Service;

    @GetMapping("/step2/next/{card-number}/{internet-password}")
    public ResponseEntity<Boolean> login(
        @PathVariable("card-number") String cardNumber,
        @PathVariable("internet-password") String internetPassword
    ){
        return new ResponseEntity<>(step2Service.login(cardNumber, internetPassword), HttpStatus.OK);
    }
}
