package com.Day11_Q1;

public interface X {

	void eat();
	
	default void sleep() {
		
		System.out.println("inside default method sleep of interface X");
	}
	
	static void walk() {
		
		System.out.println("inside static method walk of interface X");
	}
}
