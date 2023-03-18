package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@GetMapping("/greeting")
	public String greeting() {
		return "Hello World!";
	}
	@GetMapping("/greeting/user")
	public String greetinguser() {
		return "Hello User!";
	}

}
