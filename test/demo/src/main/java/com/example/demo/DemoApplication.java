package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.rest.Rest;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Rest.p = "test";
		SpringApplication.run(DemoApplication.class, args);		
	}
}
