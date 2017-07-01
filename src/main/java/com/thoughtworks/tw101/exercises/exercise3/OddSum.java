package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int sum = 0;

        // loop through numbers
        for (int i = start; i <= end; i++) {

            // check if number is odd
            if (i % 2 == 1) {

                // add odd number to sum
                sum += i;

            }

        }

        return sum;
    }
}
