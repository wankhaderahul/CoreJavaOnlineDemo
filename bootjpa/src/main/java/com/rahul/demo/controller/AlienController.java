package com.rahul.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rahul.demo.model.Alien;
import com.rahul.demo.repo.AlienRepo;



//@Controller
@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/addAlien")
	public ModelAndView addAlien(Alien alien) {
		repo.save(alien);
		
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		List<Alien> alienList=(List<Alien>) repo.findAll();
		mv.addObject("alienList", alienList);
		
		return mv;
		
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		
		ModelAndView mv=new ModelAndView("editAlien.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		System.out.println(repo.findByTech("java"));
		System.out.println(repo.findByAidGreaterThan(101));
		System.out.println(repo.findByTechSorted("java"));
		return mv;
		
	}
	
	@RequestMapping("/getAllAlien")
	public ModelAndView getAllAlien() {
		
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		List<Alien> alienList=(List<Alien>) repo.findAll();
		mv.addObject("alienList", alienList);
		
		return mv;
		
	}
	
	@RequestMapping("/updateAlien")
	public ModelAndView updateAlien(@ModelAttribute("alien") Alien alien) {
		
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		repo.save(alien);
        List<Alien> alienList=(List<Alien>) repo.findAll();
		mv.addObject("alienList", alienList);
		
		return mv;
		
	}
	
	@RequestMapping("/deleteAlien")
	public ModelAndView deleteAlien(@RequestParam int aid) {
		
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		repo.deleteById(aid);
        List<Alien> alienList=(List<Alien>) repo.findAll();
		mv.addObject("alienList", alienList);
		
		return mv;
		
	}
	
	@RequestMapping("/deleteAllAlien")
	public ModelAndView deleteAllAlien() {
		
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		repo.deleteAll();
		List<Alien> alienList=(List<Alien>) repo.findAll();
		mv.addObject("alienList", alienList);
		
		return mv;
		
	}
	
	//@RequestMapping(path="/alien",produces="application/json")
	//@RequestMapping(path="/alien",produces="application/xml")
	//@RequestMapping("/alien")
	//@ResponseBody
	@GetMapping(path="/alien",produces="application/json")
	public List<Alien> getAliens() {
		
		
		return repo.findAll();
		
	}
	
	//@RequestMapping("/alien/{aid}")
	//@ResponseBody
	@GetMapping(path="/alien/{aid}",produces="application/json")
	//@GetMapping("/alien/{aid}")
	public Optional<Alien> getAlienById(@PathVariable("aid") int aid) {
		
		
		return repo.findById(aid);
		
	}
	
	@PostMapping(path="/alien",consumes="application/json")
	public Alien addsAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
		
	}
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlienById(@PathVariable("aid") int aid) {
		
		Alien a=repo.getOne(aid);
		repo.delete(a);
        
		return "deleted";
		
	}
	
	@PutMapping(path="/alien",consumes="application/json")
	public Alien saveOrUpdate(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
		
	}
}
