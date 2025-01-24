package com.assessment.app;


import java.util.Scanner;
public class OldLegendaryProblem
{
public static void main(String [] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number of Terms: ");
	int no_of_terms = scan.nextInt();
	int sum1 = 0;
	int sum2 = 0;
	int sum3 = 0;
	int [] array = new int [no_of_terms];
	System.out.println("Enter The Array Elements : ");
	for(int i=0;i<array.length;i++)
	{
		array[i] = scan.nextInt();
	}
	
	for(int i=0;i<array.length;i+=3)
	{
			sum1 += array[i];
	}
	
	for(int i=1;i<array.length;i+=3)
	{
			sum2 += array[i];
	}
	
	for(int i=2;i<array.length;i+=3)
	{
			sum3 += array[i];
	}
	
	System.out.println("The Solution for the OldLegendaryProblem: "+sum1+" "+sum2+" "+sum3);

	
}
}