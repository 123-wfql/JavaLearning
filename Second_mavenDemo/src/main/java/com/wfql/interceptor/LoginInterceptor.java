package com.wfql.interceptor;

import com.wfql.entity.Login;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Login login = (Login)request.getSession().getAttribute("login");
        if (login != null) {
            return true;
        } else {
            response.sendRedirect("/login");
            return false;
        }
    }
}
