package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isTriangle = (firstSide + secondSide > thirdSide &&
                              secondSide + thirdSide > firstSide &&
                              thirdSide + firstSide > secondSide);

        String answer = isTriangle ? "this is a valid triangle" : "it's not a triangle";
        System.out.println(answer);
    }

}
