package com.javafudamentals.app;


import java.util.Scanner;

public class ArrayMaxDifference{

	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
	
	        int size = scan.nextInt();

	        if (size <= 3) //input validation
	        {
	            System.out.println("Enter an Array size greater than 3.");
	        }
	        else
	        {
	        int [] array = new int[size];//array declaration
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < array.length; i++) //getting user input for the array
	        {
	            array[i] = scan.nextInt();
	        }

	        int maxDifference = Math.abs(array[0] - array[2]);//initializing maximum pair as the first pair
	        int indexOfSmallerElement = 0;//initializing the maximum pair index as the first index

	        // Iterate through the array to find the pair with the maximum absolute difference
	        for (int j = 0 ; j < (array.length)-2 ; j++) //array's length -2 to avoid array out of bounds error
	        {
	            int difference = Math.abs(array[j] - array[j + 2]);
	            if (difference > maxDifference)
	            {
	                maxDifference = difference;
	                
	                if(array[j] < array[j + 2])
	                {
	                	indexOfSmallerElement = j;
	                }
	                else
	                {
	                	indexOfSmallerElement = j+2;
	                }
	            
	        }
	        }

	        // Output the result
	        int indexOfSmallerElementPair = indexOfSmallerElement +2;
	        System.out.println("Maximum absolute difference: " + maxDifference);
	        System.out.println("Index of the smaller element in the pair: " + 
	        indexOfSmallerElement+","+indexOfSmallerElementPair);

	        scan.close();
	
	}
	}
}