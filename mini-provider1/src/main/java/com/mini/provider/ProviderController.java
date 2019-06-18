package com.mini.provider;

import com.mini.feign.api.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shipc 2019/6/17 17:51
 * @version 1.0
 */
@RestController
public class ProviderController implements ScheduleServiceHi {
    @Value("${server.port}")
    private String port;

    @Override
    public String sayHiFromClientOne(String name) {
        return "hi " + name + ", i am from port:" + port;
    }
}
