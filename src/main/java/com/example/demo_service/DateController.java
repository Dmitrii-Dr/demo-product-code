package com.example.demo_service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

	@GetMapping("/date")
	public String date(@RequestParam(defaultValue = "yyyy-MM-dd") String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return LocalDate.now().format(formatter);
	}

}
