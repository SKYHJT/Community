package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String index() {
        return "index";
    }
}
