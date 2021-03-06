package com.laiql.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "cloud-provider-hystrix-payment-1001")
public interface PaymentFeignService
{
    @GetMapping(value = "/payment/{id}")
    String getPayment(@PathVariable("id") String id);
}
