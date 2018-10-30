package com.rahul;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


//if you use this class not need rahul-servlet.xml file @ annotation configuration in spring


//first way of configuration
/*@Configuration
@ComponentScan("com.rahul")
public class RahulConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/jsp");
		vr.setSuffix(".jsp");
		return vr;
		
	}

}*/


//Second way to configure

@Configuration
//@ComponentScan({"com.rahul"}) //using {} array configure multiple packages
@ComponentScan("com.rahul")
@EnableWebMvc
public class RahulConfig  extends WebMvcConfigurerAdapter{
	
	
	
}
