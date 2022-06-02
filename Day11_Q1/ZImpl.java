package com.Day11_Q1;

public class ZImpl implements Z {

	@Override
	public void eat() {
		
		System.out.println("Inside the method eat of ZImpl");
	}

	@Override
	public void run() {
		
		System.out.println("Inside the method run of ZImpl");
	}

	@Override
	public void study() {
		
		System.out.println("Inside the method study of ZImpl");
	}
	
	@Override
	public void sleep() {
		System.out.println("Inside the overriden default method sleep of ZImpl");
	}

}
