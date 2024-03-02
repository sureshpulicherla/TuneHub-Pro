package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class NavController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	@GetMapping("/newSong")
	public String newSong() {
		return "newSong";
	}
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	
}
