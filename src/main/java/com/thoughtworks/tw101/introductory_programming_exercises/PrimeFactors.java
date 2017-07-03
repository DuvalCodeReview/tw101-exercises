package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        int number = 171;
        List<Integer> primeFactors = generate(number);

        System.out.println("Prime factors of " + number + ":");
        for (Integer num : primeFactors) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                primeFactors.add(i);
            }

            while (n % i == 0) {

                n /= i;

            }
        }

        return primeFactors;
    }
}