package com.siyatech.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@GetMapping("/greet")
	public String getGreeting()
	{
		System.out.println("Something Change in file again");
		return "Hello Docker working";
	}
}
