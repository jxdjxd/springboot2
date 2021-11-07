package com.jxd.boot_web_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试获取request请求域中的数据
 * @author jxd
 * @date 2021/11/7 17:23
 */
@Controller
public class RequestRegionController {

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request){
        request.setAttribute("msg", "success");
        request.setAttribute("code", 200);
        return "forward:success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute String msg,
                       @RequestAttribute Integer code,
                       HttpServletRequest request){
        Object msg1 = request.getAttribute("msg");
        HashMap<String, Object> map = new HashMap<>();
        map.put("requestMethod_msg", msg1);
        map.put("annotationMethod_msg", msg);
        return map;
    }

    // 矩阵变量(默认没有开启)
    // /testMatrix/sell;low=34;brand=byd,audi,yd
    @ResponseBody
    @GetMapping("/testMatrix/{path}")
    public Map testMatrix(@MatrixVariable("low") Integer low,
                          @MatrixVariable("brand") List<String> brand,
                          @PathVariable("path") String path){
        HashMap<String, Object> map = new HashMap<>();
        map.put("low", low);
        map.put("brand", brand);
        map.put("path",path);
        return map;
    }
}
