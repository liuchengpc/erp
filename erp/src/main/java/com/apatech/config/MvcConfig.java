package com.apatech.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MvcConfig extends WebMvcConfigurationSupport {
	


//	@Override
//	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/")
//				.addResourceLocations("file:e:/images/");
//		super.addResourceHandlers(registry);
//	}
//
//	@Override
//	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		StringHttpMessageConverter string = new StringHttpMessageConverter(StandardCharsets.UTF_8);
//		converters.add(string);
//		converters.add(new MappingJackson2HttpMessageConverter());
//		converters.add(new ByteArrayHttpMessageConverter());
//		super.configureMessageConverters(converters);
//	}
	
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
                .allowCredentials(true)
                .maxAge(3600)
                .allowedHeaders("*");
    }




	

}
