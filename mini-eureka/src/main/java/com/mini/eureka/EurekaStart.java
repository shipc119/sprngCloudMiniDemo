package com.mini.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shipc 2019/6/17 17:03
 * @version 1.0
 */
@EnableEurekaServer
@SpringBootApplication
@RestController
public class EurekaStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStart.class);
    }
}
