package com.example.community.controller;

import com.example.community.dto.PaginationDTO;
import com.example.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author hujingtao
 * @Date 2020/2/25 14:17
 * @Version 1.0
 **/
@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "5") Integer size){
        PaginationDTO paginationDTO = questionService.list(page,size);
        System.out.println(paginationDTO.toString());
        model.addAttribute("paginationDTO",paginationDTO);
        return "index";
    }
}
