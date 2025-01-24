package com.javafudamentals.app;
import java.util.Scanner;

public class ProductSeries{
    public static void main(String[] args) {
		// Scanner for user input
        Scanner scanner = new Scanner(System.in);
        // Input of first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Validate the first number
        if (firstNumber <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        // Input of second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        // Validate the second number
        if (secondNumber <= 0 || firstNumber >= secondNumber) {
            System.out.println("Invalid Input");
            return;
        }
        // Accept the number of terms to generate
        System.out.print("Enter the number of terms to generate: ");
        int numberOfTerms = scanner.nextInt();
        // Validate the number of terms
        if (numberOfTerms <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        // Print the series
        System.out.print("Series: " + firstNumber + ", " + secondNumber);
        int temp1 = firstNumber;
        int temp2 = secondNumber;

        for (int i = 0; i < numberOfTerms; i++) {
            int nextTerm = temp1 * temp2;
            System.out.print(", " + nextTerm);
            temp1 = temp2;
            temp2 = nextTerm;
        }
        // close scanner
        scanner.close();
    }
}

