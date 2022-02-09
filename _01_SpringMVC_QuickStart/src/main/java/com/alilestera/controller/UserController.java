package com.alilestera.controller;

import com.alilestera.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Alilestera
 * @date 2/8/2022
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/user/{id}")
    public String findUserById(@PathVariable("id") Integer id) {
        System.out.println("findUserById的实现代码");
        System.out.println("id = " + id);
        return "/success.jsp";
    }

    @GetMapping("/user/{id}/{name}")
    public String findUser(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        System.out.println("findUser的实现代码");
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        return "/success.jsp";
    }

    @PostMapping("/user")
    public String insertUser(@RequestBody Map map) {
        System.out.println("insertUser的实现代码");
        System.out.println(map);
        return "/success.jsp";
    }

    @PostMapping("/users")
    public String insertUsers(@RequestBody List<User> users) {
        System.out.println("insertUsers的实现代码");
        System.out.println(users);
        return "/success.jsp";
    }

    @PostMapping("/checkUser")
    @ResponseBody
    public User checkUser(@RequestBody User user) {
        System.out.println("checkUser的实现代码");
        return user;
    }
}
