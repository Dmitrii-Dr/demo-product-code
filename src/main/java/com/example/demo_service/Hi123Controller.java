package com.example.demo_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi123Controller {

	@GetMapping("/123")
	public String hi123() {
		return "Hi 123";
	}

}
