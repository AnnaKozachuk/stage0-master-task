package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (isValidTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("This is a valid triangle");
        } else {
            System.out.println("It's not a triangle");
        }
    }

    private boolean isValidTriangle(double a, double b, double c) {
        // Triangle inequality theorem: the sum of the lengths of any two sides of a triangle must be greater than the length of the remaining side
        return a + b > c && a + c > b && b + c > a;
    }

}
