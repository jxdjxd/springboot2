package com.jxd.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxd
 * @date 2021/11/6 21:47
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String HelloController() {
        return "Hello, SpringBoot2!";
    }
}
