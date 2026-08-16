package com.example.demo_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello3Controller {

	@GetMapping("/hello3")
	public String hello3() {
		return "Hi hi hi";
	}

}
