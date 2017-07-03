package com.thoughtworks.tw101.introductory_programming_exercises;

public class TriangleExercises {
    public static void main(String[] args) {
        drawAnAsterisk();
        drawAHorizontalLine(8);
        drawAVerticalLine(5);
        drawARightTriangle(5);
    }

//    Easiest exercise ever
//    Print one asterisk to the console.
//    Example: *
    private static void drawAnAsterisk() {
        System.out.println("drawAnAsterisk call: ");
        System.out.print("*");
        System.out.println("\n------------------------------------");
    }

//    Draw a horizontal line
//    Given a number n, print n asterisks on one line.
//    Example when n=8:  ********
    private static void drawAHorizontalLine(int n) {
        System.out.println("drawAHorizontalLine call: ");
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println("\n------------------------------------");
    }

//    Draw a vertical line
//    Given a number n, print n lines, each with one asterisks
//    Example when n=3:
//            *
//            *
//            *
    private static void drawAVerticalLine(int n) {
        System.out.println("drawAVerticalLine call: ");
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        System.out.println("------------------------------------");
    }

//    Draw a right triangle
//    Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
//    Example when n=3:
//            *
//            **
//            ***
    private static void drawARightTriangle(int n) {
        System.out.println("drawARightTriangle call: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
    }
}
