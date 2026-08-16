package com.example.demo_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DimaController {

	@GetMapping("/Dima")
	public String dima() {
		return "Hi Dima";
	}

}
