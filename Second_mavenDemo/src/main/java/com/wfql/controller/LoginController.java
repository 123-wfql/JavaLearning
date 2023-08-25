package com.wfql.controller;

import com.wfql.entity.Login;
import com.wfql.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/checkLogin")
    public String checkLogin(Login login, Model model, HttpSession session) {
        System.out.println("loginId = " + login.getLoginId());
        System.out.println("loginPwd = " + login.getLoginPwd());

        session.setAttribute("login", login);

        model.addAttribute("loginId", login.getLoginId());
        return "success";
    }

    @RequestMapping("/showLogin")
    public String showLogin(Model model) {
        List<Login> logins = loginService.getAllLogin();

        model.addAttribute("logins", logins);
        return "show_login";
    }

    @RequestMapping("/showLoginTest")
    @ResponseBody
    public List<Login> showLoginTest() {
        return loginService.getAllLogin();
    }
}
