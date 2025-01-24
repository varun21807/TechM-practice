package com.javafudamentals.app;

import java.util.Scanner;

public class BikeRaceBonus {
    public static void main(String[] args) {
		// Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the distance traveled
        System.out.print("Enter the distance traveled by the bike: ");
        int distance = scanner.nextInt();

        // Check if the distance is invalid
        if (distance < 0) {
            System.out.println();
        } else if (distance == 0) {
            // If the distance is zero, bonus points are zero
            System.out.println("Bonus points: 0");
        } else {
            // Calculate bonus points for valid distances
            int evenProduct = 1;
            int oddProduct = 1;

            // Loop through each digit of the distance
            int position = 1; // Start with the rightmost digit
            while (distance > 0) {
                int digit = distance % 10;
                if (position % 2 == 1) {
                    oddProduct *= digit; // Odd position
                } else {
                    evenProduct *= digit; // Even position
                }
                position++; // Move to the next position
                distance /= 10; // Remove the processed digit
            }


            // Calculate bonus points based on the conditions
            int bonusPoints;
            if (evenProduct == oddProduct) {
                bonusPoints = 2 * evenProduct;
            } else if (evenProduct > oddProduct) {
                bonusPoints = evenProduct;
            } else {
                bonusPoints = oddProduct;
            }

            // Display the bonus points
            System.out.println("Bonus points: " + bonusPoints);
        }

        // Close the scanner
        scanner.close();
    }
}
