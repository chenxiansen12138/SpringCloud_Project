package com.chen.xiansen.controller;


import com.chen.xiansen.service.FeignHystrixOrderService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class FeignHystrixOrderController {

    @Resource
    FeignHystrixOrderService feignHystrixOrderService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id) {
        return feignHystrixOrderService.paymentInfo_ok(id);
    }

//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value="1500")
//    })
 //   @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String timeout_false(@PathVariable("id") Integer id) {
        return feignHystrixOrderService.timeout_false(id);
    }
    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池:"+Thread.currentThread().getName()+"-"+id;
    }
    public String payment_Global_FallbackMethod(){
        return "Global处理信息异常";
    }
}
