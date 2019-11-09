package com.javafullstackdev.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		
		return "hello javafullstackdev";
	}
	
	@GetMapping("/greeting")
	public Map<String, String> getGreeting(){
		
		Map<String, String> greeting = new HashMap<>();
		greeting.put("message", "hello from javafullstackdev");
		
		return greeting;
	}
	
}
