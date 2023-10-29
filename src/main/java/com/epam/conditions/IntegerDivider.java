package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }

        String answer = "cannot be divided completely";

        if (dividend / divider * divider == dividend) {
            answer = "can be divided completely";
        }

        System.out.println(answer);
    }

}
