package com.javafudamentals.app;

import java.util.Scanner;

public class GiftCalculator {
	
    public static void main(String[] args) {
		// Scanner for user input
        Scanner scanner = new Scanner(System.in);
        // Accept the number of boxes sold by each individual
        System.out.print("Enter the number of boxes sold by Sara:");
        int sara = scanner.nextInt();
        System.out.print("Enter the number of boxes sold by Harry:");
        int harry = scanner.nextInt();
        System.out.print("Enter the number of boxes sold by Leo:");
        int leo = scanner.nextInt();
        System.out.print("Enter the number of boxes sold by James:");
        int james = scanner.nextInt();

        // Determine which individuals receive gifts
        if (sara == harry && harry == leo && leo == james) {
            // All sold the same number of boxes
            System.out.println("Sara,Harry,Leo,and James receive gifts.");
            //Any three sold the same number of boxes
        } else if (sara == harry && harry == leo) {
            System.out.println("Sara,Harry,and Leo receive gifts.");
        } else if (sara == harry && harry == james) {
            System.out.println("Sara,Harry,andJamesreceive gifts.");
        } else if (sara == leo && leo == james) {
            System.out.println("Sara,Leo,and James receive gifts.");
        } else if (harry == leo && leo == james) {
            System.out.println("Harry,Leo,and James receive gifts.");
        } else {
            // Use Math functions to determine the maximum sales
            int maxSale = Math.max(Math.max(sara,harry), Math.max(leo,james));
            // Find the person with maxsale 
            System.out.print("The following individuals receive gifts:");
            if (sara == maxSale) {
                System.out.print("Sara");
            }
            if (harry == maxSale) {
                System.out.print("Harry");
            }
            if (leo == maxSale) {
                System.out.print("Leo");
            }
            if (james == maxSale) {
                System.out.print("James");
            }

        }
        //close scanner
        scanner.close();
    }
}
