package com.jxd.boot.controller;

import com.jxd.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxd
 * @date 2021/11/6 21:47
 */
@RestController
public class HelloController {

    private final Car car;

    @Autowired
    public HelloController(Car car){
        this.car = car;
    }

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/hello111")
    public String helloController() {
        return "Hello, SpringBoot2!";
    }
}
