package com.jxd.controller;

import com.jxd.bean.City;
import com.jxd.bean.Student;
import com.jxd.bean.User;
import com.jxd.service.CityService;
import com.jxd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;

/**
 * @author jxd
 * @date 2021/11/7 20:37
 */
@Controller
public class IndexController {

    @Autowired
    StudentService studentService;

    @Autowired
    CityService cityService;

    /**
     * 来登录页
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    /**
     * 处理登录请求
     * @return
     */
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())){
            // 将登录成功的用户保存起来
            session.setAttribute("loginUser", user);
            // 登录成功，重定向到main.html;防止表单重复提交
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号或密码错误！");
            return "login";
        }
    }

    /**
     * 去main页面
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
        return "main";
    }

    @ResponseBody
    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam("id") Long id){
        return studentService.getStudentById(id);
    }

    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id){
        return cityService.getById(id);
    }

    @ResponseBody
    @PostMapping("/city")
    public City insertCity(City city){
        cityService.insertCity(city);
        return city;
    }

    @ResponseBody
    @PostMapping("/insertCity")
    public City insertCityUseAnnotation(City city){
        cityService.insertCityUseAnnotation(city);
        return city;
    }
}
