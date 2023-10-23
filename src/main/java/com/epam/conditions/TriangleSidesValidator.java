package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (isValidTriangleSide(firstSide) && isValidTriangleSide(secondSide) && isValidTriangleSide(thirdSide)) {
            if ((firstSide + secondSide > thirdSide) && (firstSide + thirdSide > secondSide) && (secondSide + thirdSide > firstSide)) {
                System.out.println("this is a valid triangle");
            } else {
                System.out.println("it's not a triangle");
            }
        } else {
            System.out.println("it's not a triangle");
        }
    }

    private boolean isValidTriangleSide(double side) {
        return side > 0;
    }

}
