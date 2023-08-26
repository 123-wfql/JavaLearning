package com.wfql.controller;

import com.wfql.entity.Admin;
import com.wfql.entity.Users;
import com.wfql.service.AdminService;
import com.wfql.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/showAdmins")
    public String showAdmins(Model model) {
        List<Admin> admins = adminService.getAllAdmins();

        model.addAttribute("admins", admins);
        return "show_admins";
    }
}
