package com.wfql.controller;

import com.wfql.entity.Login;
import com.wfql.entity.Users;
import com.wfql.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/showUsers")
    public String showUsers(Model model) {
        List<Users> users = usersService.getAllUsers();

        model.addAttribute("users", users);
        return "show_users";
    }
}
