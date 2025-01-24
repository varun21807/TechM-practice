package com.assessment3.app;

import java.util.*;

/**
 * Custom Exception for Invalid Format.
 */
class InvalidFormatException extends Exception {
    public InvalidFormatException(String message) {
        super(message);
    }
}

/**
 * Custom Exception for Invalid Phone Number.
 */
class PhoneValidationException extends Exception {
    public PhoneValidationException(String message) {
        super(message);
    }
}

/**
 * Ticket Booking System for managing passenger details and generating booking IDs.
 */
public class TicketBookingSystem {
/**
 * 
 * @param name
 * @param seatNumber
 * @return
 */
    // Method to generate booking ID
    public static String generateBookingID(String name, String seatNumber) {
        String firstThreeLetters = name.length() > 3 ? name.substring(0, 3).toUpperCase() : name.toUpperCase();
        int randomNumber = new Random().nextInt(9000) + 1000; // Generates a 4-digit random number
        return firstThreeLetters + randomNumber + seatNumber;
    }

    // Method to validate the input format
    /**
     * 
     * @param input
     * @throws InvalidFormatException
     * @throws PhoneValidationException
     */
    public static void validateInput(String input) throws InvalidFormatException, PhoneValidationException {
        String[] details = input.split(",");
        if (details.length != 3) {
            throw new InvalidFormatException("Invalid input format. Expected format: Name,Phone,SeatNumber.");
        }

        String name = details[0].trim();
        String phone = details[1].trim();
        String seatNumber = details[2].trim();

        // Validate phone number (10 digits, numeric only)
        if (!phone.matches("\\d{10}")) {
            throw new PhoneValidationException("Invalid phone number. Phone number must be numeric and exactly 10 digits.");
        }

        // Booking ID generation for valid input
        String bookingID = generateBookingID(name, seatNumber);
        System.out.println("Booking ID: " + bookingID);
    }
/**
 * 
 * @param args
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter passenger details (Name,Phone,SeatNumber): ");
        String input = scanner.nextLine();

        try {
            // Validate and process the input
            validateInput(input);
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
        } catch (PhoneValidationException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

