package com.Day11_Q1;

public interface Y {

	void run();
	
	default void ride() {
		
		System.out.println("inside default method ride of interface Y");
	}
	
	static void drive() {
		
		System.out.println("inside static method drive of interface Y");
	}
}
