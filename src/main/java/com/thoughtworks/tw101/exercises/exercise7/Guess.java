package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Duvall_Lanell on 7/4/17.
 */
public class Guess {

    private static boolean checkGuess(int guess, int number) {
        if (guess == number) {
            System.out.println("You guessed " + guess + ". Correct!!!!!!");
            return true;
        } else if (guess > number) {
            System.out.println(guess + " is too High.");
            return false;
        } else {
            System.out.println(guess + " is too Low.");
            return false;
        }
    }

    public static void promptRandomNumberGuessing() {
        int randomNumber = getRandomNumber(1, 100);
        int guessNum;
        Scanner scan = new Scanner(System.in);

        System.out.print("Guess the number between 1 and 100: ");
        guessNum = scan.nextInt();

        while (!checkGuess(guessNum, randomNumber)) {
            System.out.print("Guess the number between 1 and 100: ");
            guessNum = scan.nextInt();
        }
    }

    private static int getRandomNumber(int min, int max) {
        int num;
        Random rand = new Random();

        return num = rand.nextInt(100) + 1;
    }
}
