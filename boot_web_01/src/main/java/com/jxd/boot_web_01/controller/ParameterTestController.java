package com.jxd.boot_web_01.controller;

import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import javax.servlet.http.Cookie;
import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jxd
 * @date 2021/11/7 15:40
 */
@RestController
public class ParameterTestController {

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String, String> pv,
                                      @RequestHeader("User-Agent") String userAgent,
                                      @RequestHeader Map<String, String> header,
                                      @RequestParam Integer age,
                                      @RequestParam Map<String, String> params
//                                      @CookieValue("_ga") String _ga,
//                                      Cookie cookie
                                      ){
        Map<String, Object> map = new HashMap<>();
//        map.put("id", id);
//        map.put("name", name);
//        map.put("pv", pv);
//        map.put("userAgent", userAgent);
//        map.put("header", header);
//        map.put("age",age);
//        map.put("params", params);

//        map.put("_ga", _ga);
//        map.put("cookie", cookie);
        return map;
    }

    @PostMapping("/testGetPostMessage")
    public Map<String, Object> testGetPostMessage(@RequestBody String content){
        Map<String, Object> map = new HashMap<>();
        map.put("content",content);
        return map;
    }
}
