package com.naite.bookingTour.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/access-denied").setViewName("access-denied");
		registry.addViewController("/").setViewName("home");
	}
	
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {///login controller handle by this
//        registry.addViewController("/login").setViewName("pages/auth_login.html");//login controller, and user will redirect to this page auth_login.html
//    }
}