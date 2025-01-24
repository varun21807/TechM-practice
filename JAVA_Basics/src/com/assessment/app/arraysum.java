package com.assessment.app;

import java.util.Scanner;
public class arraysum
{
public static void main(String [] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the size of the array:");
	int size = scan.nextInt();
	int [] array = new int [size];
	System.out.println("Enter the Array elements :");
	for(int i=0;i<array.length;i++)
	{
		array[i] = scan.nextInt();
	}
	
	System.out.println("Enter the LowerBound :");
	int lower_bound = scan.nextInt();
	System.out.println("Enter the Upperbound :");
	int upper_bound = scan.nextInt();
	int lower_index = array.length;
	int upper_index = array.length;
	int sum=0;
	
	for(int i=0;i<array.length;i++)
	{
		if(array[i] == lower_bound)
		{
			lower_index = i;
		}
		else if(array[i] == upper_bound)
		{
			upper_index = i;
		}
	}
	
	for(int i=0;i<lower_index ; i++)
	{
		sum+=array[i];
	}
	for(int i=upper_index+1;i<array.length ; i++)
	{
		sum+=array[i];
	}
	
	System.out.println("The Sum of the Array is : " + sum);
}
}