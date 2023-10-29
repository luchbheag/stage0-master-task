package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {

        if (year < 0 || month < 0 || month > 12) {
            System.out.println("invalid date");
            return;
        }
        int days = 30;
        if (month == 2) {
            if (isLeapYear(year)) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month <= 7) {
            if (month % 2 != 0) {
                days = 31;
            }
        } else {
            if (month % 2 == 0 ) {
                days = 31;
            }
        }
        System.out.println(days);
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

}
