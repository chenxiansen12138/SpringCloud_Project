package com.chen.xiansen.springcloud.service.impl;

import com.chen.xiansen.entities.Payment;
import com.chen.xiansen.springcloud.mapper.PaymentMapper;
import com.chen.xiansen.springcloud.service.PayMentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PayMentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
