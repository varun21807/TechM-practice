package com.assessment.app;

import java.util.*;

public class PinGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The numbers you enter must be in the range of 100 to 999");
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		if(num1>999 || num1<100) {
			System.out.println("The number should be in the range of 100 to 999.");
			sc.close();
			return;
		}
		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();
		if(num2>999 || num2<100) {
			System.out.println("The number should be in the range of 100 to 999.");
			sc.close();
			return;
		}
		System.out.println("Enter the num3: ");
		int num3 = sc.nextInt();
		if(num3>999 || num3<100) {
			System.out.println("The number should be in the range of 100 to 999.");
			sc.close();
			return;
		}
		
		int pin1=0;
		int pin2=9; 
		int pin3=9; 
		int pin4=9; 
		int arr[] = {num1,num2,num3};
		
		for(int i=0;i<3;i++) {
			while(arr[i]>0) {
				int rem1 = arr[i]%10;
				if(pin4>rem1) {
					pin4 = rem1;
				}
				if(pin1<rem1) {
					pin1 = rem1;
				}
				arr[i]/=10;
				int rem2 = arr[i]%10;
				if(pin3>rem2) {
					pin3 = rem2;
				}
				if(pin1<rem2) {
					pin1 = rem2;
				}
				arr[i]/=10;
				int rem3 = arr[i]%10;
				if(pin2>rem3) {
					pin2 = rem3;
				}
				if(pin1<rem3) {
					pin1 = rem3;
				}
				arr[i]/=10;
			}
		}
		System.out.println("The Pin is:"+pin1+""+pin2+""+pin3+""+pin4);
		sc.close();
	}
}