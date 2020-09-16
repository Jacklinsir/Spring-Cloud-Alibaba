package com.laiql.cloud.controller;

import com.laiql.cloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderFeignController
{
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/{id}")
    public String getPaymentById(@PathVariable("id") String id)
    {
        return paymentFeignService.getPayment(id);
    }
}
