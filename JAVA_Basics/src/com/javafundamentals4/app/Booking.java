package com.javafundamentals4.app;

class Booking {
    private User user;
    private Movie movie;
    private Seat seat;
    private String showTime;

    public Booking(User user, Movie movie, Seat seat, String showTime) {
        this.user = user;
        this.movie = movie;
        this.seat = seat;
        this.showTime = showTime;
    }

    public void confirmBooking() {
        System.out.println("Booking Confirmed!");
        System.out.println("User: " + user);
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat: " + seat.getSeatId());
    }
}