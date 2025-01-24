package com.javafudamentals.app;

import java.util.Scanner;

public class EmployeeAgeAverage {
    public static void main(String[] args) {
		// Scanner for user input
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        System.out.println("Enter the ages of employees (between 28 and 40). Enter an age outside this range to stop:");
        while (true) {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            // Halt the input process if age is out of range
            if (age < 28 || age > 40) {
                System.out.println("Age out of range. Stopping input process.");
                break;
            }
            // Calculate the sum and count of valid ages
            sum += age;
            count++;
        }
        // Ensure at least two employees in the dataset
        if (count < 2) {
            System.out.println("Insufficient data. At least two employees are required.");
        } else {
            // Calculate the average age
            double averageAge = (double) sum / count;
            System.out.printf("The average age of the selected employees is: %.2f\n", averageAge);
        }
        //close scanner
        scanner.close();
    }
}

