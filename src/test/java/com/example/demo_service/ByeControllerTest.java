package com.example.demo_service;

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
class ByeControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void byeReturnsPersonalizedMessageWithDefaultName() throws Exception {
		mockMvc.perform(get("/bye"))
				.andExpect(status().isOk())
				.andExpect(content().string("Goodbye my love"));
	}

	@Test
	void byeReturnsPersonalizedMessageWithCustomName() throws Exception {
		mockMvc.perform(get("/bye").param("name", "world"))
				.andExpect(status().isOk())
				.andExpect(content().string("Goodbye world"));
	}

}
