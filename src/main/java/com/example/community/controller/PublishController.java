package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName PublishController
 * @Description TODO
 * @Author hujingtao
 * @Date 2020/2/25 15:57
 * @Version 1.0
 **/
@Controller
public class PublishController {
    @GetMapping("/publish")
    public String publish(){
        return "publish";
    }
}
