package com.javafudamentals.app;
import java.util.*;

public class TotalSnackBill {

	public static void main(String[] args) {
		// Scanner for user input
		Scanner scanner=new Scanner(System.in);
		// Prompt user for the quantity of each item
		System.out.println("Enter the quantity of Pizzas purchased:");
		int quantity_of_pizza=scanner.nextInt();
		System.out.println("Enter the quantity of Puffs purchased:");
		int quantity_of_puffs=scanner.nextInt();
		System.out.println("Enter the quantity of Cool drinks purchased:");
		int quantity_of_cooldrinks=scanner.nextInt();
		// Prices of items
		final int pizza_price=100;
		final int puffs_price=20;
		final int cooldrink_price=10;
		// Calculate the total price
		final int total_price=(quantity_of_pizza*pizza_price)
				        +(quantity_of_puffs*puffs_price)
				        +(quantity_of_cooldrinks*cooldrink_price);
		// Display the bill details
		System.out.println("The total number of pizzas purchased:"+quantity_of_pizza);
		System.out.println("The total number of puffss purchased:"+quantity_of_puffs);
		System.out.println("The total number of cool drinks purchased:"+quantity_of_cooldrinks);
		System.out.println("The total price:"+total_price);
		System.out.println("             ENJOY THE SHOW!!!");
		// Close the scanner
		scanner.close();
		



		
		

	}

}
