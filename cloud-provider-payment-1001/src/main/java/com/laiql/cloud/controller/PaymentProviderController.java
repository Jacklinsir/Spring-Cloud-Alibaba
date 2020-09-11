package com.laiql.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class PaymentProviderController
{

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/{id}")
    public String paymentInterface(@PathVariable("id") String id)
    {
        return "SpringCloud service port: " + port + "\t" + "UUID:" + UUID.randomUUID().toString() + "参数ID:" + id;
    }
}
