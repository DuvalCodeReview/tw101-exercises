package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    // declare increment counter
    private int incrementCounter;

    public Accumulator() {
        // initialize variable
        incrementCounter = 0;
    }

    public void increment() {
        // increase increment counter by 1
        incrementCounter += 1;
    }

    public void total() {
        // print incrementCounter
        System.out.println("Number of increment calls: " + incrementCounter);
    }
}
