package com.javafudamentals.app;

import java.util.Scanner;
public class CompactableArray 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		//object of the scanner class
		
		System.out.println("Enter the size of the First array : ");
		int size1 = scan.nextInt();
		int [] arr1 = new int[size1];
		System.out.println("Enter the size of Second array : ");
		int size2 = scan.nextInt();
		int [] arr2 = new int[size2];
		//Getting the size of the arrays from the user 
		
		boolean compatibility = false; // a boolean variable which is used later
		if(size1 == 0 || size2 == 0 || 
				size1<size2 || size1>size2) //checking whether if the size of both the arrays are equal 
		{
			System.out.println("------------Invalid Array Size------------");
		}
		else
		{
		for(int i=0;i<arr1.length;i++) //getting the input from the user for the first array
		{
			System.out.println("Enter the element " +i+ " Of the First Array : ");
			arr1[i] = scan.nextInt();
		}
		for(int i=0;i<arr2.length;i++) //getting the input from the user for the Second array
		{
			System.out.println("Enter the element " +i+ " Of the Second Array : ");
			arr2[i] = scan.nextInt();
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>=arr2[i]) //compatibility checking
			{
				compatibility=true; // changing the value of the variable to true based on the condition
				
			}
			else
			{
				compatibility = false;
				break; // breaking the loop if even a single element is not compatible
			}
			
		}
		
		if(compatibility == true)
		{
			System.out.println("----------Arrays are Compatible------------");
		}
		else
		{
			System.out.println("----------Arrays are not Compatible------------");
		}
		
		// printing the result based on the compatibility found
		}
		scan.close();
		
	}

}
