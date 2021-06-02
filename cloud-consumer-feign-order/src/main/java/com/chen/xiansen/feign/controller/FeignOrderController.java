package com.chen.xiansen.feign.controller;

import com.chen.xiansen.entities.CommonResult;
import com.chen.xiansen.entities.Payment;
import com.chen.xiansen.feign.service.PaymentFeignService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class FeignOrderController {
    @Resource
    PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    @ResponseBody
    public CommonResult<Payment> getPaymentId(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
