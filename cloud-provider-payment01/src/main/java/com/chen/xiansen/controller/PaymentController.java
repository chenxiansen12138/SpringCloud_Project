package com.chen.xiansen.controller;
import com.chen.xiansen.entities.CommonResult;
import com.chen.xiansen.entities.Payment;
import com.chen.xiansen.service.PayMentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PayMentService payMentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = payMentService.create(payment);
        log.info("****插入结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功", result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = payMentService.getPaymentById(id);
        log.info("****插入结果:" + payment);
        if (payment != null) {
            return new CommonResult(200, serverPort+",查询数据库成功", payment);
        } else {
            return new CommonResult(444, "查询数据库失败", null);
        }
    }
}
