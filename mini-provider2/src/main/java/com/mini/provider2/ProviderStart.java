package com.mini.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shipc 2019/6/17 17:47
 * @version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderStart {
    public static void main(String[] args) {
        SpringApplication.run(ProviderStart.class);
    }
}
