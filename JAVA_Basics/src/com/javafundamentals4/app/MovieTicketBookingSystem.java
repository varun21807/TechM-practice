package com.javafundamentals4.app;
import java.util.Scanner;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Predefined Users
        User[] users = {
            new User("user1", "password1"),
            new User("user2", "password2")
        };

        // Step 2: Predefined Movies
        Movie[] movies = {
            new Movie("Movie A", new String[] {"10:00 AM", "1:00 PM", "6:00 PM"}, 5, 5),
            new Movie("Movie B", new String[] {"11:00 AM", "3:00 PM", "7:00 PM"}, 5, 5)
        };

        // Step 3: User Login
        User loggedInUser = null;
        System.out.println("Welcome to the Movie Ticket Booking System!");
        while (loggedInUser == null) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            for (User user : users) {
                if (user.validate(username, password)) {
                    loggedInUser = user;
                    break;
                }
            }

            if (loggedInUser == null) {
                System.out.println("Invalid credentials. Please try again.");
            }
        }

        System.out.println("Login successful! Welcome, " + loggedInUser);

        // Step 4: Display Movies
        System.out.println("\nAvailable Movies:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i].getTitle());
        }

        // Step 5: Select a Movie
        System.out.print("Select a movie by number: ");
        int movieChoice = scanner.nextInt();
        Movie selectedMovie = movies[movieChoice - 1];

        // Step 6: Display Showtimes
        selectedMovie.displayShows();
        System.out.print("Select a show by number: ");
        int showChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String selectedShowTime = selectedMovie.getShowTimes()[showChoice - 1];

        // Step 7: Display and Select Seats
        selectedMovie.displaySeats(showChoice - 1);
        System.out.print("Enter seat ID to book: ");
        String seatId = scanner.nextLine();

        // Validate and Reserve Seat
        Seat selectedSeat = selectedMovie.getSeat(showChoice - 1, seatId);
        if (selectedSeat == null || !selectedSeat.isAvailable()) {
            System.out.println("Seat not available or invalid. Exiting...");
            return;
        }

        selectedSeat.reserve();

        // Step 8: Confirm Booking
        Booking booking = new Booking(loggedInUser, selectedMovie, selectedSeat, selectedShowTime);
        booking.confirmBooking();

        System.out.println("\nThank you for using the Movie Ticket Booking System!");
        scanner.close();
    }
}
