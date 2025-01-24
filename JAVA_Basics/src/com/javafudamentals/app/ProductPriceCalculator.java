package com.javafudamentals.app;

import java.util.Scanner;

public class ProductPriceCalculator {
    public static void main(String[] args) {
        // Create scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Prompt for product type
        System.out.print("Enter product type (E for Electric Kettle, I for Induction Stove): ");
        char ProductName = scanner.next().charAt(0);
        // Ensure valid product type input
        if (ProductName != 'E' && ProductName != 'I') {
            System.out.println("Invalid product type. Please enter 'E' or 'I'.");
            return;
        }

        // Prompt for number of units ordered
        System.out.print("Enter number of units ordered: ");
        int UnitsOrdered = scanner.nextInt();
        
        // Declare price per unit variable
        int PricePerUnit = 0;

        // Determine price per unit based on product type and number of units
        if (ProductName == 'E') {
            // Logic for Electric Kettle
            if (UnitsOrdered >= 21) {
            	PricePerUnit = 850;
            } else if (UnitsOrdered >= 11) {
            	PricePerUnit = 900;
            } else {
            	PricePerUnit = 950;
            }
        } else if (ProductName == 'I') {
            // Logic for Induction Stove
            if (UnitsOrdered >= 26) {
            	PricePerUnit = 975;
            } else if (UnitsOrdered >= 16) {
            	PricePerUnit = 1000;
            } else {
            	PricePerUnit = 1100;
            }
        }

        // Calculate total amount
        int totalAmount = PricePerUnit * UnitsOrdered;

        // Display the total amount
        System.out.println("Total amount to be paid: " + totalAmount);

        // Close the scanner
        scanner.close();
    }
}
