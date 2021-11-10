package com.jxd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传
 * @author jxd
 * @date 2021/11/10 9:40
 */
@Slf4j
@Controller
public class FormTestController {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("headerImgs") MultipartFile[] headerImgs) throws IOException {
        log.info("上传的信息：email={}, username={}, headerImg={}, headerImgs={}",
                 email, username, headerImg.getSize(), headerImgs.length);
        if(!headerImg.isEmpty()){
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("G:\\test\\img\\" + originalFilename));
        }
        if(headerImgs.length > 0){
            for (MultipartFile img : headerImgs) {
                if(!img.isEmpty()){
                    img.transferTo(new File("G:\\test\\imgs\\" + img.getOriginalFilename()));
                }
            }
        }
        return "main";
    }
}
