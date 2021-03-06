package com.alilestera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Alilestera
 * @date 2/11/2022
 */
@Controller
@SessionAttributes({"name"})
public class JspController {

    @RequestMapping("/testRquestScope")
    public String testRquestScope(Model model) {
        model.addAttribute("name", "琪露诺");
        model.addAttribute("age", "9");
        return "/WEB-INF/page/test.jsp";
    }

    @RequestMapping("/testRquestScope2")
    public ModelAndView testRquestScope2(ModelAndView modelAndView) {
        modelAndView.addObject("name", "芙兰朵露");
        modelAndView.addObject("age", "456");
        modelAndView.setViewName("/WEB-INF/page/test.jsp");
        return modelAndView;
    }

    @RequestMapping("/testGetAttribute")
    public String testGetAttribute(@RequestAttribute("org.springframework.web.servlet.HandlerMapping.bestMatchingPattern") String value,
                                   HttpServletRequest request) {
        System.out.println(value);
        return "/WEB-INF/page/test.jsp";
    }

    @RequestMapping("/testSessionScope")
    public String testSessionScope(Model model) {
        model.addAttribute("name", "灵梦小姐");
        model.addAttribute("age", "20");
        return "/WEB-INF/page/test.jsp";
    }

    @RequestMapping("/testGetSessionAttr")
    public String testGetSessionAttr(@SessionAttribute("name") String name) {
        System.out.println(name);
        return "/WEB-INF/page/test.jsp";
    }
}
