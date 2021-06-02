package com.chen.xiansen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class CloudHystrixDashboardMain {
    public static void main(String[] args) {
        SpringApplication.run(CloudHystrixDashboardMain.class,args);
    }
}
