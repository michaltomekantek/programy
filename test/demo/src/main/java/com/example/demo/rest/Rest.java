package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	public static String p = "";

	@Override
	public String toString() {
		return "Rest [test()=" + test() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@RequestMapping(value = "path", method = RequestMethod.GET)
	public String test() {
		
		return p;
	}
	
	

}
