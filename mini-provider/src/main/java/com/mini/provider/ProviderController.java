package com.mini.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shipc 2019/6/17 17:51
 * @version 1.0
 */
@RestController
public class ProviderController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String home(@PathVariable String name) {
        return "hi " + name + ", i am from port:" + port;
    }
}
