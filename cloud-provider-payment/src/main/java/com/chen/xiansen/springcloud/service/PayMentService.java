package com.chen.xiansen.springcloud.service;

import com.chen.xiansen.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PayMentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
