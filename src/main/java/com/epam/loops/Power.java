package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int result = 1;
        for (int i = 0; i < Math.abs(power); i++) {
            result *= numberToPrint;
        }
        if (power < 0) {
            result = -result;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
