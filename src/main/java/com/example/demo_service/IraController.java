package com.example.demo_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IraController {

	@GetMapping("/Ira")
	public String ira() {
		return "Hi Ira Hi";
	}

}
