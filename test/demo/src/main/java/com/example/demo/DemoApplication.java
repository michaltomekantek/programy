package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examle.generic.GenericTestClass;
import com.example.demo.rest.Rest;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	//	Rest.p = "test7";
		//SpringApplication.run(DemoApplication.class, args);
		
		GenericTestClass<Rest> t = new GenericTestClass<>(new Rest());
		
		t.showValue();
		
	}
}
