package com.example.demo_service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DateControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void dateReturnsCurrentDateWithDefaultFormat() throws Exception {
		String expected = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		mockMvc.perform(get("/date"))
				.andExpect(status().isOk())
				.andExpect(content().string(expected));
	}

	@Test
	void dateReturnsCurrentDateWithCustomFormat() throws Exception {
		String expected = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		mockMvc.perform(get("/date").param("format", "dd/MM/yyyy"))
				.andExpect(status().isOk())
				.andExpect(content().string(expected));
	}

}
