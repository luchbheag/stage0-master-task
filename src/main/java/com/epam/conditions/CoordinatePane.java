package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String answer = null;

        if (x == 0 || y == 0) {
            answer = "zero";
        } else if (x > 0) {
            if (y > 0) {
                answer = "first";
            } else {
                answer = "fourth";
            }
        } else {
            if (y > 0) {
                answer = "second";
            } else {
                answer = "third";
            }
        }

        System.out.println(answer);
    }

}

