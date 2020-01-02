package com.apatech.config;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.apatech.domain.Users;

/**
 * 拦截器，登录检查
 */
public class LoginHandlerInterceptor implements HandlerInterceptor{
	
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Users emp = (Users) session.getAttribute("emp");
        // 如果获取的request的session中的loginUser参数为空（未登录），就返回登录页，否则放行访问
        if (emp == null) {
        	System.out.println("未登录");
        	response.sendRedirect("/topage/index");
           return false;
        } else {
            // 已登录，放行 
        	
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
