package com.alilestera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author Alilestera
 * @date 2/12/2022
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(String username, String password, HttpSession session) {
        session.setAttribute("username", username);
        return "/WEB-INF/page/success.jsp";
    }
}
