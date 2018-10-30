package com.rahul;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rahul.service.AddService;

@Controller
public class AddController {
	
	
	//using simple Httpservlet request 
	/*@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request) {
		
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		int result; //=i+j;
		AddService ad=new AddService();
		result=ad.add(i, j);
		
		ModelAndView mv =new ModelAndView();
		mv.setViewName("/display.jsp");
		mv.addObject("result",result);
		
		return mv;
	}*/
	
	//using spring anotation
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam ("t2")int j) {
		
		int result;
	AddService ad=new AddService();
		result=ad.add(i, j);
		
		ModelAndView mv =new ModelAndView();
		//mv.setViewName("/WEB-INF/jsp/display");//if you use InternalResourceViewResolver suffix .jsp not need to add extention .jsp
		mv.setViewName("/WEB-INF/jsp/display.jsp");
		mv.addObject("result",result);
		
		return mv;
	}

}
