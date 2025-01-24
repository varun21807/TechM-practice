package com.javafundamentals1.app;
import java.util.Scanner;

public class TicketReservation {

    private boolean[][] seating;
    private String[] categories = {"Regular", "Premium", "VIP"};

    public TicketReservation() {
        // Initialize jagged array with seating categories and their seat availability
        seating = new boolean[3][];
        seating[0] = new boolean[10]; // Regular: 10 seats
        seating[1] = new boolean[5];  // Premium: 5 seats
        seating[2] = new boolean[2];  // VIP: 2 seats

        // Mark all seats as available (true)
        for (int i = 0; i < seating.length; i++) {
            for (int j = 0; j < seating[i].length; j++) {
                seating[i][j] = true;
            }
        }
    }

    public void displaySeatingCategories() {
        // Display available seating categories and the number of available seats in each
        System.out.println("Available Seating Categories:");
        for (int i = 0; i < categories.length; i++) {
            int availableSeats = 0;
            for (boolean seat : seating[i]) {
                if (seat) {
                    availableSeats++;
                }
            }
            System.out.println(categories[i] + ": " + availableSeats + " seat(s) available");
        }
    }

    public void reserveTicket() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to select a seating category
        displaySeatingCategories();
        System.out.print("Enter the seating category you want to book (Regular, Premium, VIP): ");
        String category = scanner.nextLine().trim();

        int categoryIndex = -1;
        for (int i = 0; i < categories.length; i++) {
            if (categories[i].equalsIgnoreCase(category)) {
                categoryIndex = i;
                break;
            }
        }

        if (categoryIndex != -1) {
            boolean seatReserved = false;
            for (int i = 0; i < seating[categoryIndex].length; i++) {
                if (seating[categoryIndex][i]) {
                    seating[categoryIndex][i] = false; // Reserve the seat
                    seatReserved = true;
                    System.out.println("Seat successfully reserved in " + categories[categoryIndex] + " category!");
                    break;
                }
            }

            if (!seatReserved) {
                System.out.println("No seats available in " + categories[categoryIndex] + " category. Please choose another category.");
            }
        } else {
            System.out.println("Invalid category. Please choose a valid seating category.");
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Display Seating Categories");
            System.out.println("2. Reserve a Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    displaySeatingCategories();
                    break;
                case "2":
                    reserveTicket();
                    break;
                case "3":
                    System.out.println("Thank you for using the Ticket Reservation System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        TicketReservation system = new TicketReservation();
        system.start();
    }
}
