package com.javafudamentals.app;

import java.util.Scanner;

public class FactorCalculator {
    public static void main(String[] args) {
		// Scanner for user input
        Scanner scanner = new Scanner(System.in);
        // Input number
        System.out.print("Enter an integer: ");
        int Integer = scanner.nextInt();
        // Handling zero case
        if (Integer == 0) {
            System.out.println("No Factors");
            return;
        }
        // If the Integer is negative, convert it to positive manually
        if (Integer < 0) {
        	Integer = -Integer;
        }
        // Find and print factors in ascending order
        System.out.println("Factors of "+Integer+" are: ");
        for (int i = 1; i <= Integer; i++) {
            if (Integer % i == 0) {
              System.out.println(i);
            }
        }
     // Close the scanner
     		scanner.close();
    }
    
}
