package com.mini.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shipc 2019/6/17 18:43
 * @version 1.0
 */
@FeignClient(value = "provider-hi")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    String sayHiFromClientOne(@PathVariable(value = "name") String name);
}
