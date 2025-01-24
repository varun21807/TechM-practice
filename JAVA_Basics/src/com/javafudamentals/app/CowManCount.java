package com.javafudamentals.app;

import java.util.Scanner;

public class CowManCount {
    public static void main(String[] args) {
		// Scanner for user input
        Scanner scanner = new Scanner(System.in);
        // Prompt for the total number of heads and legs
        System.out.print("Enter the total number of heads: ");
        int heads = scanner.nextInt();
        System.out.print("Enter the total number of legs: ");
        int legs = scanner.nextInt();
        // Validate the input
        if (legs > heads * 4 || legs % 2 != 0) {
            System.out.println("Invalid input: Total number of legs is inconsistent with the number of heads.");
        } else {
            // Calculate the number of cows and men
            int cows = (legs - (2 * heads)) / 2;
            int men = heads - cows;
            if (cows < 0 || men < 0) {
                System.out.println("Invalid input: The calculation resulted in negative counts.");
            } else {
                // Output the results
                System.out.println("Number of cows: " + cows);
                System.out.println("Number of men: " + men);
            }
        }
        // Close the scanner
        scanner.close();
    }
}
