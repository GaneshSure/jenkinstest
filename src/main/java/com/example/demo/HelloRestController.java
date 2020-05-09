package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping(value="/")
	public String hello() {
		return "Welcome to jenkins workshop of Sure Ganesh Reddy/Geetha";
		//return "Hello Nellore People";
	}

}
