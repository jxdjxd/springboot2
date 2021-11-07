package com.jxd.boot_web_01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxd
 * @date 2021/11/7 15:35
 */
@RestController
public class HelloController {

    // 将请求url中的参数赋值给函数参数
    @RequestMapping("/hello")
    public String hello(@RequestParam("userName") String name){
        return name;
    }

}
