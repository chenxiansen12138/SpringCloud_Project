package com.chen.xiansen.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @RequestMapping("/payment/zk")
    public String getzookeeper(){
        return "zookeeper";
    }
}
