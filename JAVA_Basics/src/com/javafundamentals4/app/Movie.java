package com.javafundamentals4.app;

class Movie {
    private String title;
    private String[] showTimes;
    private Seat[][] seats;

    public Movie(String title, String[] showTimes, int rows, int cols) {
        this.title = title;
        this.showTimes = showTimes;
        this.seats = new Seat[showTimes.length][rows * cols];

        // Initialize seats for each show
        for (int i = 0; i < showTimes.length; i++) {
            for (int j = 0; j < rows * cols; j++) {
                seats[i][j] = new Seat("R" + (j / cols + 1) + "C" + (j % cols + 1));
            }
        }
    }

    public void displayShows() {
        System.out.println("Show timings for " + title + ":");
        for (int i = 0; i < showTimes.length; i++) {
            System.out.println((i + 1) + ". " + showTimes[i]);
        }
    }

    public void displaySeats(int showIndex) {
        System.out.println("Available seats for show " + showTimes[showIndex] + ":");
        for (Seat seat : seats[showIndex]) {
            if (seat.isAvailable()) {
                System.out.print(seat.getSeatId() + " ");
            }
        }
        System.out.println();
    }

    public Seat getSeat(int showIndex, String seatId) {
        for (Seat seat : seats[showIndex]) {
            if (seat.getSeatId().equals(seatId)) {
                return seat;
            }
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public String[] getShowTimes() {
        return showTimes;
    }
}
