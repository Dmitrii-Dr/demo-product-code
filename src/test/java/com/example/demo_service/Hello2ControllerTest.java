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
class Hello2ControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void hello2ReturnsHelloWorld() throws Exception {
		mockMvc.perform(get("/hello2"))
				.andExpect(status().isOk())
				.andExpect(content().string("hello world"));
	}

}
