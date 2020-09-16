package com.laiql.cloud.controller;

import com.laiql.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentProviderController
{

    @Value("${server.port}")
    private String port;

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/{id}")
    public String paymentInterface(@PathVariable("id") String id)
    {
        return paymentService.getPayment(id);
    }
}
