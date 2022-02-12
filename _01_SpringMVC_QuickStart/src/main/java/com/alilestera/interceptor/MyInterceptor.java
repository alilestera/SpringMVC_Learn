package com.alilestera.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alilestera
 * @date 2/12/2022
 */
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 在handler方法执行之前会被调用
     * @param request 当前请求对象
     * @param response 响应对象
     * @param handler 相当于是真正能够处理请求的handler方法封装成的对象，对象中有这方法的相关信息
     * @return 返回值代表是否放行，如果为true则放行，如果为false则拦截，目标方法执行不到
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    /**
     * postHandle方法会在Handler方法执行之后执行
     * @param request 当前请求对象
     * @param response 响应对象
     * @param handler 相当于是真正能够处理请求的handler方法封装成的对象，对象中有这方法的相关信息
     * @param modelAndView handler方法执行后的modelAndView对象，我们可以修改其中要跳转的路径或者是域中的数据
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    /**
     * afterCompletion方法会在最后执行
     * @param request 当前请求对象
     * @param response 响应对象
     * @param handler 相当于是真正能够处理请求的handler方法封装成的对象，对象中有这方法的相关信息
     * @param ex 异常对象
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
