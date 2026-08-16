package com.example.demo_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello4Controller {

	@GetMapping("/hello4")
	public String hello4() {
		return "Hi hi hi hi";
	}

}
