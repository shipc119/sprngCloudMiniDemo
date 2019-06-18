package com.mini.feign;

import com.mini.feign.api.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shipc 2019/6/17 18:45
 * @version 1.0
 */
@RestController
public class HiController {
    @Autowired
    private ScheduleServiceHi scheduleServiceHi;

    @RequestMapping(value = "/hi/feign/{name}", method = RequestMethod.GET)
    public String sayHi(@PathVariable String name) {
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
