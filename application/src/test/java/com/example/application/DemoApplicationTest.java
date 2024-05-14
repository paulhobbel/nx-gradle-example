package com.example.application;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTest {

	@Test
	public void contextLoads() {
		assertThat(true).isTrue();
	}

}
