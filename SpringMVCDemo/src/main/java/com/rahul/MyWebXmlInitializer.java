package com.rahul;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


// if you use this class not need web.xml file @ annotation base configuration in spring
public class MyWebXmlInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new  Class [] {RahulConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
		
		//return   new  Class [] {RahulConfig.class};//if you use in rahul-servlet.xml in InternalResourceViewResolver use this class
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String [] {"/"};
	}

}
