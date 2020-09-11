package com.laiql.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController
{
    public static final String INVOK_URL = "http://cloud-provider-payment-1001/payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/order-pay")
    public String orderPayment()
    {
        return restTemplate.getForObject(INVOK_URL, String.class);
    }
}
