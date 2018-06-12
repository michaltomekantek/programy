package com.examle.generic;

public class GenericTestClass <T>{
	
	T value;
	
	public GenericTestClass(T value) {
		this.value = value;
	}
	
	public void showValue() {
		System.out.println("Wartosc " + value);
	}

}
