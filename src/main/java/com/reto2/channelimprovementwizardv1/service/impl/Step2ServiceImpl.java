package com.reto2.channelimprovementwizardv1.service.impl;

import com.reto2.channelimprovementwizardv1.proxy.BusinessCustomerV1CardProxy;
import com.reto2.channelimprovementwizardv1.service.Step2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Step2ServiceImpl implements Step2Service {
    @Autowired
    private BusinessCustomerV1CardProxy businessCustomerV1CardProxy;

    @Override
    public Boolean login(String cardNumber, String internetPassword) {
        return businessCustomerV1CardProxy.validateCard(cardNumber, internetPassword) ;
    }
}
