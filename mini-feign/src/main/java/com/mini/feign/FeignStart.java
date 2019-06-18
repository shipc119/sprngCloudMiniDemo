package com.mini.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author shipc 2019/6/17 18:47
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.mini"})
@EnableDiscoveryClient
@EnableFeignClients
public class FeignStart {
    public static void main(String[] args) {
        SpringApplication.run(FeignStart.class);
    }
}
