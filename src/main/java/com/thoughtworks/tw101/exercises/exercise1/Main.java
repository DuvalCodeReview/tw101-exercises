package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Odd numbers from 1 to 100:");

        // loop through numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            // check if number is odd
            if (i % 2 == 1) {
                // print odd number
                System.out.print(i + " ");

                // add odd number to sum
                sum += i;
            }
        }

        // print sum
        System.out.println("\n\nSum of odd numbers between 1 to 100: " + sum);

    }
}
