package com.example.demo_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

	@GetMapping("/bye")
	public String bye(@RequestParam(defaultValue = "my love") String name) {
		return "Goodbye " + name;
	}

}
