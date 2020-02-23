package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author hujingtao
 * @Date 2020/2/22 18:01
 * @Version 1.0
 **/

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("name", "琪琪");
        //相当于访问 /templates/hello.html
        return "hello";
    }
}
