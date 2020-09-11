package com.laiql.cloud.controller;

import com.laiql.cloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeignController
{

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/{id}")
    public String getPaymentById(@PathVariable("id") String id)
    {
        return paymentFeignService.getPayment(id);
    }
}
