package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(3);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****

    private static void drawSpaces(int spaces){
        for (int spaceCount = 1; spaceCount <= spaces; spaceCount++) {
            System.out.print(" ");
        }
    }
    private static void drawStars(int stars){
        for (int starCount = 1; starCount <= stars; starCount++) {
            System.out.print("*");
        }
    }
    private static void drawAnIsoscelesTriangle(int n) {
        int stars = 1, spaces = n + 1;

        for (int row = 1; row <= n; row++, stars+=2, spaces-=1) {
            drawSpaces(spaces);
            drawStars(stars);
            System.out.println();
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        System.out.println("drawADiamond call: ");

        drawAnIsoscelesTriangle(n-1);
        int stars = (2*n)-1;  //1 + 2(n-1) (we need the stars and spaces info  to carry over)
        int spaces = 1;       //n - 1

        for (int row = 1; row <= n; row++) {
            for (int spaceCount = 1; spaceCount <= spaces; spaceCount++) {
                System.out.print(" ");
            }
            for (int starCount = 1; starCount <= stars; starCount++) {
                System.out.print("*");
            }
            System.out.println();
            stars -= 2;
            spaces += 1;
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
