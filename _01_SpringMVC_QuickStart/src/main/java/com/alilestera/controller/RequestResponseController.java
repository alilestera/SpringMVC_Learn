package com.alilestera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Alilestera
 * @date 2/11/2022
 */
@Controller
public class RequestResponseController {
    @RequestMapping("/getReqAndRes")
    public String getReqAndRes(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println();
        return "/success.jsp";
    }

    @RequestMapping("/getHeader")
    public String getHeader(@RequestHeader(value = "device-type") String deviceType) {
        System.out.println(deviceType);
        return "/success.jsp";
    }

    @RequestMapping("/getCookie")
    public String getCookie(@CookieValue("JSESSIONID") String sessionId) {
        System.out.println(sessionId);
        return "/success.jsp";
    }
}
