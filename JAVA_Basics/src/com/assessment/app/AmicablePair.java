package com.assessment.app;


import java.util.Scanner;

public class AmicablePair {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of X: ");
		int first_num = scan.nextInt();
		System.out.println("Enter the value of Y: ");
		int second_num = scan.nextInt();
		int Sum1 = 0;
		int	Sum2=0;
		for(int i=1;i<first_num;i++) {
			if(first_num%i==0) {
				Sum1+=i;
			}
		}
		for(int j=1;j<second_num;j++) {
			if(second_num%j==0) {
				Sum2+=j;
			}
		}
		
		if(Sum1 == second_num && Sum2 == first_num) {
			System.out.println("The number "+first_num+" and "+second_num+" are Amicable Pair");
		}
		else {
			System.out.println("The number "+first_num+" and "+second_num+" are not a Amicable Pair.");
		}
		scan.close();
	}
}

