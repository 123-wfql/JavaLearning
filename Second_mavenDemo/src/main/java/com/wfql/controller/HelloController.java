package com.wfql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String toHello() {
        return "hello";
    }

    @RequestMapping("/hello1")
    public ModelAndView toHello1() {
        ModelAndView modelAndView = new ModelAndView();
        //定义视图名称
        modelAndView.setViewName("hello");
        //携带信息
        modelAndView.addObject("tips", "I am from controller");

        return modelAndView;
    }

    @RequestMapping("/login")
    public String toLogin() {
        return "login";
    }
}
