package com.mini.feign.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shipc 2019/6/17 18:43
 * @version 1.0
 */
@FeignClient(value = "provider-hi", fallback = ScheduleServiceHi.ServiceHiFallback.class, configuration = {})
public interface ScheduleServiceHi {

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    String sayHiFromClientOne(@PathVariable(value = "name") String name);

    public static class ServiceHiFallback implements ScheduleServiceHi{
        @Value("server.port")
        private String port;
        @Override
        public String sayHiFromClientOne(String name) {

            return "fallback: hi " + name + "from port:" + port;
        }
    }
}
