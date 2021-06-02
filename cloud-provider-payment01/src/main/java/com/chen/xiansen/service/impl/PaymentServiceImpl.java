package com.chen.xiansen.service.impl;

import com.chen.xiansen.entities.Payment;
import com.chen.xiansen.mapper.PaymentMapper;
import com.chen.xiansen.service.PayMentService;
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
