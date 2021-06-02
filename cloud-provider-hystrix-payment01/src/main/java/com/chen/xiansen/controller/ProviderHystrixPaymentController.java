package com.chen.xiansen.controller;

import com.chen.xiansen.service.ProviderHystrixPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class ProviderHystrixPaymentController {

    @Resource
    ProviderHystrixPaymentService providerHystrixPaymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        log.info(providerHystrixPaymentService.paymentInfo_Ok(id));
        return providerHystrixPaymentService.paymentInfo_Ok(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String timeout_false(@PathVariable("id") Integer id){
        log.info(providerHystrixPaymentService.timeout_False(id));
        return providerHystrixPaymentService.timeout_False(id);
    }
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        return providerHystrixPaymentService.paymentCircuitBreaker(id);
    }
}
