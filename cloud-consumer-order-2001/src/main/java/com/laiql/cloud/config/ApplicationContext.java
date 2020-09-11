package com.laiql.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Description: 公共配置中心
 * <br/>
 * ApplicationContext
 * Created by laiql on 2020/9/11 17:18.
 */
@Configuration
public class ApplicationContext
{
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
