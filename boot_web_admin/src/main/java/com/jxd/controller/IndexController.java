package com.jxd.controller;

import com.jxd.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpSession;

/**
 * @author jxd
 * @date 2021/11/7 20:37
 */
@Controller
public class IndexController {

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
        // 判断是否登录
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser != null){
            return "main";
        }else{
            model.addAttribute("msg","未登录");
            return "login";
        }
    }
}
