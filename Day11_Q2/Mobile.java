package com.Day11_Q2;

import java.util.Scanner;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String brandName, String... modelName){
		
		for(int i=0; i<outdatedModels.length; i++)
		{
			for(String model: modelName)
			{
				if(outdatedModels[i].equals(model))
				{
					System.out.println(model + "_OUTDATED");
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		m1.searchOutdatedModel("redmi","note4","note8","note5");
	}
}
