package com.alilestera.controller;

import com.alilestera.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;

/**
 * @author Alilestera
 * @date 2/7/2022
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "/hello.html";
    }

    @RequestMapping("/testPath")
    public String testPath() {
        System.out.println("testPath处理了请求");
        return "/success.jsp";
    }

    @PostMapping(value = "/testMethod")
    public String testMethod() {
        System.out.println("testMethod处理了请求");
        return "/success.jsp";
    }

    @RequestMapping(value = "/testParams", method = RequestMethod.GET, params = "code")
    public String testParams() {
        System.out.println("testParams处理了请求");
        return "/success.jsp";
    }

    @RequestMapping(value = "/testParams2", method = RequestMethod.GET, params = "!code")
    public String testParams2() {
        System.out.println("testParams2处理了请求");
        return "/success.jsp";
    }

    @RequestMapping(value = "/testParams3", method = RequestMethod.GET, params = "code=1")
    public String testParams3() {
        System.out.println("testParams3处理了请求");
        return "/success.jsp";
    }

    @RequestMapping(value = "/testParams4", method = RequestMethod.GET, params = "code!=1")
    public String testParams4() {
        System.out.println("testParams4处理了请求");
        return "/success.jsp";
    }

    @RequestMapping(value = "/testHeaders", method = RequestMethod.GET, headers = "deviceType")
    public String testHeaders() {
        System.out.println("testHeaders处理了请求");
        return "/success.jsp";
    }

    @RequestMapping(value = "/testConsumes", method = RequestMethod.POST, consumes = "multipart/form-data")
    public String testConsumes() {
        System.out.println("testConsumes处理了请求");
        return "/success.jsp";
    }

    @GetMapping("/testRequestParam")
    public String testRequestParam(User user) {
        System.out.println("testRequestParam的实现代码");
        System.out.println(user);
        return "/success.jsp";
    }

    @GetMapping("/testDateConverter")
    public String testDateConverter(@DateTimeFormat(pattern = "yyyy/MM/dd") Date date) {
        System.out.println("testDateConverter的实现代码");
        System.out.println(date);
        return "/success.jsp";
    }

    @GetMapping("/testJump")
    public String testJump() {
        return "redirect:/success.jsp";
    }
}
