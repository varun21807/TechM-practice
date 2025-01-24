package com.assessment3.app;
/**
 * Multithreaded program to display:
 * a. First `n` odd numbers.
 * b. Numbers from `1 to n` in reverse order.
 */


class OddNumbersThread extends Thread {
    private int n;
/**
 * 
 * @param n
 */
    public OddNumbersThread(int n) {
        super("Odd Numbers");
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName());
        for (int i = 1, count = 0; count < n; i += 2, count++) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + Thread.currentThread().getName() + " finished execution.");
    }
}
/**
 * 
 */
class ReverseThread extends Thread {
    private int n;

    public ReverseThread(int n) {
        super("Reverse");
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName());
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + Thread.currentThread().getName() + " finished execution.\n");
    }
}

public class OddAndReverse {
    public static void main(String[] args) {
        int n = 10; // Define n (e.g., 10 for demo purposes)
        // Create and start Odd Numbers thread
        OddNumbersThread oddNumbersThread = new OddNumbersThread(n);
        oddNumbersThread.start();
        // Create and start Reverse thread
        ReverseThread reverseThread = new ReverseThread(n);
        reverseThread.start();
        // Wait for threads to complete (optional)
        try {
            oddNumbersThread.join();
            reverseThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished execution.");
    }
}

