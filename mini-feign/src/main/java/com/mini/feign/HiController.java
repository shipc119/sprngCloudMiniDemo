package com.mini.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shipc 2019/6/17 18:45
 * @version 1.0
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String sayHi(@PathVariable String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
