package com.jxd.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.bean.User1;
import com.jxd.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * @author jxd
 * @date 2021/11/7 21:20
 */
@Controller
public class TableController {
    @Autowired
    User1Service user1Service;

    @GetMapping("/basic_table")
    public String basic_table(){

        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn", defaultValue = "1")Integer pn,
                                Model model){
        List<User1> user1s = user1Service.list();

        Page<User1> user1Page = new Page<>(pn, 2);

        //page是查询的结果
        Page<User1> page = user1Service.page(user1Page, null);

        model.addAttribute("page", page);

        return "table/dynamic_table";
    }

    @GetMapping("/user1/delete")
    public String deleteUser1(@RequestParam(name = "id") Long id,
                              @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                              RedirectAttributes ra){
        user1Service.removeById(id);
        ra.addAttribute("pn", pn);
        return "redirect:/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

    @GetMapping("/pricing_table")
    public String pricing_table(){
        return "table/pricing_table";
    }

}
