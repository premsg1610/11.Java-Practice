package com.Day11_Q3;

import java.util.Scanner;

public class IPL {

	public void homeTeamStadium(Stadium stadium){
		
		switch(stadium)
		{
		 case EDEN_GARDENS_STADIUM:
			 System.out.println("This is the home ground of KKR");
			 break;
			 
		 case WANKHEDE_STADIUM:
			 System.out.println("This is the home ground of Mumbai Indians");
			 break;
			 
		 case CHIDAMBARAM_STADIUM:
			 System.out.println("This is the home ground of CSK");
			 break;
			 
		 case M_CHINNASWAMY_STADIUM:
			 System.out.println("This is the home ground of RCB");
			 break;
			 
		 default:
			 System.out.println("this stadium details is not available.");
		}
		
	   
	}
	
	
	public static void main(String[] args) {
		
		IPL i1 = new IPL();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the stadium name:");
		String stadiumName = sc.next();
		
		sc.close();
		
		Stadium s1 = Stadium.valueOf(stadiumName);
		
		i1.homeTeamStadium(s1);
	}
}
