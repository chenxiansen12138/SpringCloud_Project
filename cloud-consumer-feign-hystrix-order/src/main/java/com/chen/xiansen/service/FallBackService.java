package com.chen.xiansen.service;

import org.springframework.stereotype.Component;

@Component
public class FallBackService implements FeignHystrixOrderService{
    @Override
    public String paymentInfo_ok(Integer id) {
        return "我好烦呐";
    }

    @Override
    public String timeout_false(Integer id) {
        return "我真的不知道自己该怎么办";
    }
}
