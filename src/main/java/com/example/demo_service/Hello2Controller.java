package com.example.demo_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

	@GetMapping("/hello2")
	public String hello2() {
		return "hello world";
	}

}
