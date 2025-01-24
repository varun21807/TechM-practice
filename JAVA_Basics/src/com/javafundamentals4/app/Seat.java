package com.javafundamentals4.app;

class Seat {
    private String seatId;
    private boolean isReserved;

    public Seat(String seatId) {
        this.seatId = seatId;
        this.isReserved = false;
    }

    public boolean isAvailable() {
        return !isReserved;
    }

    public void reserve() {
        isReserved = true;
    }

    public String getSeatId() {
        return seatId;
    }
}
