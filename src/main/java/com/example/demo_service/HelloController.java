package com.example.demo_service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	public String hello() {
		return "<html><body>Hello</body></html>";
	}

}
