package com.apatech.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.apatech.domain.Roleprivilege;
import com.apatech.domain.Users;
import com.apatech.mapper.RoleprivilegeMapper;

@Component//让spring容器创建该类对象，表示其它组建
public class MyInterceptor  implements HandlerInterceptor {
	@Autowired
	private RoleprivilegeMapper dao;//角色权限管理表
	/***
	 * 
	 * 执行控制器之前执行该方法，返回false表示不执行控制器
	 * 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("进入preHandler（执行控制器之前执行该方法，返回false表示不执行控制器）");
		/**
		 * 是否白名单，不管是否登录都可以看到，loginIn register
		 */
		/**
		 * 
		 * 登录后才能看到的
		 */
		System.out.println("preHandler");
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");//把对象从session中取出来
		if(user==null) {
			return true;
		}
		if (user.getRoleid()==3) {
			System.out.println("此人是管理员！！！！！！！！！！！！");
			return true;
		}
		System.out.println("用户信息");
		System.out.println(user.toString());
		List<Roleprivilege> list = (List<Roleprivilege>)request.getAttribute("prem");//获取当前用户的权限id

		if(list==null) {
			System.out.println("用户角色id");
			System.out.println(user.getRoleid());
			list=dao.selectByroleid(user.getRoleid());//角色id查询权限
			request.setAttribute("perm", list);
		}
		
		String path = request.getRequestURI();//获取请求地址
		boolean flag = false;
		for(Roleprivilege m : list) {
			System.out.println(path+"---"+m.getPath());
			if(path.equals(m.getPath())) {
				System.out.println("有权限.....");
				flag = true;
				return true;
			}
		}
		System.out.println("没有权限....");
    	response.sendRedirect("/topage/wqx");
		return flag;
	}
	
	/**
	 * 
	 * 控制成功执行，没有发生异常情况
	 * 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("进入postHandler（控制成功执行，没有发生异常情况）");
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	/**
	 * 不管是否发生异常都会被执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("进入afterCOmpletion（不管是否发生异常都会被执行）");
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
