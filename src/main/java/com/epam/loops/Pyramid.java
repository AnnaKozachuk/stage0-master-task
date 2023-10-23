package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces
            for (int j = cathetusLength - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print numbers in increasing order (starting from 2)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
