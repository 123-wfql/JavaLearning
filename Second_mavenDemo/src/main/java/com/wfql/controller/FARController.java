package com.wfql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FARController {

    @RequestMapping("/forwardHello")
    public String forwardHello(String from) {
        return "forward:middle";
    }

    @RequestMapping("/redirectHello")
    public String redirectHello(String from) {
        return "redirect:middle";
    }

    @RequestMapping("/middle")
    public String middle(String from, Model model){
        model.addAttribute("from", from);
        return "hello";
    }

}
