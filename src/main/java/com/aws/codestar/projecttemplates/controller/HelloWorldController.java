package com.aws.codestar.projecttemplates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aws.codestar.projecttemplates.dao.AlienDao;
import com.aws.codestar.projecttemplates.model.Alien;

/**
 * Basic Spring MVC controller that handles all GET requests.
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

    private final String siteName;
    
    @Autowired
    AlienDao dao;

    public HelloWorldController(final String siteName) {
        this.siteName = siteName;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("siteName", this.siteName);
        return mav;
    }
    
    @RequestMapping("my")
    public ModelAndView myPage() {
        ModelAndView mav = new ModelAndView("myPage");
        
        return mav;
    }
    
    @RequestMapping("/home")
   	public ModelAndView home() {
       	ModelAndView mav = new ModelAndView("home");
           
           return mav;
   	}
    
    @RequestMapping("alien/{aid}")
    public ModelAndView getAlien(@PathVariable("aid") int aid) {
    	ModelAndView mv=new ModelAndView("showAlien");
        Alien a=dao.getAlien(aid);
    	mv.addObject("alien", a);
    	
		return mv;
    	
    }
    
    @RequestMapping("/getAllAlien")
	public ModelAndView getAllAlien() {
		
		ModelAndView mv=new ModelAndView("showAlien");
		List<Alien> alienList=(List<Alien>) dao.getAliens();
		mv.addObject("alienList", alienList);
		
		return mv;
    }
    
    @RequestMapping("/addAlien")
   	public ModelAndView addAlien(Alien alien) {
       	dao.createAlien(alien);
   		
   		ModelAndView mv=new ModelAndView("showAlien");
   		List<Alien> alienList=(List<Alien>) dao.getAliens();
   		mv.addObject("alienList", alienList);
   		
   		return mv;
   		
   	}
    
}
