package com.example.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestBootAppApplication {

	public static void main(String[] args) {
		System.out.println("Test");
		SpringApplication.run(TestBootAppApplication.class, args);
	}

}
