package com.todo.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	/*@RequestMapping("/{path:[^\\.]+}/**")
	public String index() {
		return "redirect:/home";
	}*/
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
    public String mainIndex() {
        return "index";
    }
	
}
