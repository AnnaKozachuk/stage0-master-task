package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int digit1 = number % 10; // Extract the units digit
        int digit2 = (number / 10) % 10; // Extract the tens digit
        int digit3 = number / 100; // Extract the hundreds digit

        // Revert the number and print the result
        int reversedNumber = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println("Reversed number: " + reversedNumber);
    }

}
