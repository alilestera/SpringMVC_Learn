package com.alilestera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alilestera
 * @date 2/12/2022
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "/WEB-INF/page/success.jsp";
    }
}
