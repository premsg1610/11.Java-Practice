package com.Day11_Q1;

public class Demo {

	
	public static void main(String[] args) {
		
		ZImpl z1 = new ZImpl();
		
//		methods of X
		z1.eat();
		z1.sleep();
		X.walk();
		
		System.out.println("===================");
		
//		methods of Y
		z1.run();
		z1.ride();
		Y.drive();
		
		System.out.println("===================");
		
//		methods of Z
		z1.study();
		
		System.out.println("===================");
		
		
	}
}
