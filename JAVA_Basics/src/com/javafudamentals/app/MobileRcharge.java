package com.javafudamentals.app;

import java.util.*;

public class MobileRcharge {
	
	public static void main(String[] args) {
		// Scanner for user input
		Scanner scan = new Scanner(System.in);
		//Display the plans
		System.out.println("Plan 1 \n1.Price = Rs.350 "
								+ "\n2.Data = 2gb/per day "
									+ "\n3.Validity = 28 Days");
		System.out.println();
		
		System.out.println("Plan 2 \n1.Price = Rs.485 "
								+ "\n2.Data = 2gb/per day"
									+ " \n3.Validity = 56 Days");
		System.out.println();
		
		System.out.println("Plan 3 \n1.Price = Rs.789 "
								+ "\n2.Data = 2gb/per day "
									+ "\n3.Validity = 84 Days");
		System.out.println();
		
		System.out.println("Plan 4 \n1.Price = Rs.1299 "
								+ "\n2.Data = 2gb/per day "
									+ "\n3.Validity = 365 Days");
		System.out.println();
		//User balance
		int user_bal = 850;
		
		System.out.println("Enter the Plan number that you want :");
		int plan_num = scan.nextInt();
		//Selecting the plan
		switch (plan_num) {
		
		case 1:
			
			if (user_bal >= 350) {
				user_bal-=350;
				System.out.println("The plan is successfully Selected!!!");
				System.out.println("Available balance is "+ user_bal);
			}
			break;
		
		case 2:
			
			if (user_bal >= 485) {
				user_bal -= 485;
				System.out.println("The plan is successfully Selected!!!");
				System.out.println("Available balance is "+ user_bal);
			}
			break;
			
		case 3:
			
			if(user_bal >= 789) {
				user_bal -= 789;
				System.out.println("The plan is successfully Selected!!!");
				System.out.println("Available balance is "+ user_bal);
				
			}
			break;
			
		case 4:
			
			if(user_bal >=1299) {
				user_bal -= 1299;
				System.out.println("The plan is successfully Selected!!!");
				System.out.println("Available balance is "+ user_bal);
			} else {
				System.out.println("Insufficent balance \nPlease select a different Plan");
			}
			break;
			
		default:
			System.out.println("Select a validate plan");
		
		}
		//close scanner
		
		scan.close();
	}
}
