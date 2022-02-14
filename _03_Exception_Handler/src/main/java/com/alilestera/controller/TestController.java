package com.alilestera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alilestera
 * @date 2/14/2022
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {
        System.out.println(1/0);
        return "/WEB-INF/page/success.jsp";
    }
}
