package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Duvall_Lanell on 7/4/17.
 */
public class Guess {
    int guessNumber;
    ArrayList<Integer> guessAttempts = new ArrayList<Integer>();
    Random rand = new Random();

    public Guess (int max, int min) {
        guessNumber = rand.nextInt(max) + min;
    }

    private boolean checkGuess(int guess, int number) {
        guessAttempts.add(guess);

        if (guess == number) {
            System.out.println("You guessed " + guess + ". Correct!!!!!!\n");
            System.out.println("Your guesses were: ");

            for (int num : guessAttempts) {
                System.out.print(num + " ");
            }

            return true;
        } else if (guess > number) {
            System.out.println(guess + " is too High.\n");
            return false;
        } else {
            System.out.println(guess + " is too Low.\n");
            return false;
        }
    }

    public void promptRandomNumberGuessing() {
        int guessNum;
        Scanner scan = new Scanner(System.in);

        System.out.print("Guess the number between 1 and 100: ");

        try {
            guessNum = scan.nextInt();

            while (!checkGuess(guessNum, guessNumber)) {
                System.out.print("Guess the number between 1 and 100: ");
                guessNum = scan.nextInt();
            }
        } catch (NumberFormatException e) {
            System.out.println("Number was not entered. Could not parse String");
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input. Expecting a number.");
        }

    }
}
