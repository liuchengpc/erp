package com.apatech.config;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.apatech.interceptor.MyInterceptor;

@Configuration
public class MvcConfig extends WebMvcConfigurationSupport {
	
	@Autowired
	MyInterceptor my;

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/")
				.addResourceLocations("file:e:/images/");
		super.addResourceHandlers(registry);
	}

	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		StringHttpMessageConverter string = new StringHttpMessageConverter(StandardCharsets.UTF_8);
		converters.add(string);
		converters.add(new MappingJackson2HttpMessageConverter());
		converters.add(new ByteArrayHttpMessageConverter());
		super.configureMessageConverters(converters);
	}
	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(my).addPathPatterns("/topage/**").excludePathPatterns("/js/**","/css/**","/images/**",
				"/topage/login",
				"/topage/login2",
				"/topage/accountindex",
				"/topage/AddForm",
				"/topage/uuid",
				"/topage/page/claim/staff_Update",
				"/topage/page/claim/showpurchase_list",
				"/topage/page/claim/addpurchase_list",
				"/topage/page/claim/updatepurchase_list",
				"/topage/page/claim/users_img",
				"/topage/page/claim/staff_Insert",
				"/topage/page/common/body_menu6",
				"/topage/page/common/body_menu7",
				"/topage/page/claim/users_home",
			
				"/topage/page/claim/shop_Query",
				"/topage/page/claim/shop_Update",
				"/topage/page/common/body_menu",
				"/topage/page/common/body_menu2",
				
				"/topage/page/claim/privilege_Update",
				"/topage/page/claim/privilege_Insert",
				"/topage/page/common/body_menu4",
				"/topage/page/claim/PerformanceRanking",
				"/topage/page/claim/CashierHandover",
				"/topage/page/common/body_menu5",
				"/topage/page/claim/transaction_record",
				"/topage/page/common/footer",
				"/topage/index",
				"/topage/NewFile",
				"/topage/add",
				"/topage/update",
				"/topage/toupload",
				
				
//				"/topage/page/claim/shop_Insert",
//				"/topage/page/claim/store_management",
//				"/topage/page/claim/position",
//				"/topage/page/claim/employee_management",
//				"/topage/page/claim/shop_type",
//				"/topage/page/claim/shop_managerment",
//				"/topage/shop_upload",
//				"/topage/shop_upload2",
//				"/topage/page/claim/supplier",
//				"/topage/page/claim/purchase_list",
//				"/topage/page/claim/cashRegister_Home",				
//				"/topage/page/claim/salesStatistics",
//				"/topage/page/claim/RevenueProfile",
//				"/topage/page/claim/PopularGoods",
//				"/topage/page/claim/member_info",
//				"/topage/page/claim/level_set",
//				"/topage/page/claim/integer_set",
//				"/topage/page/claim/recharge_deduction",
				
				
				"/topage/wqx");
		super.addInterceptors(registry);
		
//		.addInterceptor是拦截的路径
//		.excludePathPatterns()则是不拦的
//	    ​.addPathPatterns("/**")： 匹配所有路径
//	    ​.addPathPatterns("/admin/**")：匹配 /admin/ 下的所有路径
//	    ​.addPathPatterns("/secure/*")：只匹配 /secure/user，不匹配 /secure/user/info
	}
	
//	 registry.addInterceptor(new MyInterceptor()).addPathPatterns("op/**","/staff/**}","opall/**","/position/**","/model/**")
//	        .excludePathPatterns("op/toselectBysid","/js/**","/css/**","/images/**","/staff/toselectBysid","/staff/tozjdp","/staff/tozjzw")
//	        .excludePathPatterns("/model/toselectmodel","/position/topositionselect","/position/toselectpositionByid");




	

}
