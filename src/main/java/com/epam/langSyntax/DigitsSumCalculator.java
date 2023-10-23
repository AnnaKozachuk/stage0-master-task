package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10; // Remove the last digit from the number
        }
        System.out.println(sum);
    }

}
