package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int stars = 1, spaces = n + 1;

        System.out.println("drawAnIsoscelesTriangle call: ");

        for (int row = 1; row <= n; row++) {
            for (int spaceCount = 1; spaceCount <= spaces; spaceCount++) {
                System.out.print(" ");
            }
            for (int starCount = 1; starCount <= stars; starCount++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
            spaces -= 1;
        }
        System.out.println("------------------------------------");

    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int stars = 1, spaces = n + 1, rowCount = 1;

        System.out.println("drawADiamond call: ");

        for (int row = 1; row <= n+(n-1); row++) {

            if(rowCount < n) {
                for (int spaceCount = 1; spaceCount <= spaces; spaceCount++) {
                    System.out.print(" ");
                }
                for (int starCount = 1; starCount <= stars; starCount++) {
                    System.out.print("*");
                }
                System.out.println();
                stars += 2;
                spaces -= 1;
                rowCount += 1;
            } else {
                for (int spaceCount = 1; spaceCount <= spaces; spaceCount++) {
                    System.out.print(" ");
                }
                for (int starCount = 1; starCount <= stars; starCount++) {
                    System.out.print("*");
                }
                System.out.println();
                stars -= 2;
                spaces += 1;
                rowCount += 1;
            }
        }

        System.out.println("------------------------------------");

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int stars = 1, spaces = n + 1, rowCount = 1;

        System.out.println("drawADiamondWithYourName call: ");

        for (int row = 1; row <= n+(n-1); row++) {

            if(rowCount < n) {
                for (int spaceCount = 1; spaceCount <= spaces; spaceCount++) {
                    System.out.print(" ");
                }

                for (int starCount = 1; starCount <= stars; starCount++) {
                    System.out.print("*");
                }

                System.out.println();
                stars += 2;
                spaces -= 1;
                rowCount += 1;
            } else {
                for (int spaceCount = 1; spaceCount <= spaces; spaceCount++) {
                    System.out.print(" ");
                }
                if (rowCount == (n)) {
                    System.out.print("Duvall");
                } else {
                    for (int starCount = 1; starCount <= stars; starCount++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
                stars -= 2;
                spaces += 1;
                rowCount += 1;
            }
        }

        System.out.println("------------------------------------");
    }
}
