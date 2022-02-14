package com.alilestera.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Alilestera
 * @date 2/14/2022
 */
@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler({NullPointerException.class, IndexOutOfBoundsException.class, ArithmeticException.class})
    public ModelAndView handleException(Exception e) {
        String msg = e.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", msg);
        modelAndView.setViewName("/WEB-INF/page/error.jsp");
        return modelAndView;
    }
}
