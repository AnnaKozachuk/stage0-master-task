package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year > 0 && month >= 1 && month <= 12) {
            int daysInMonth;

            switch (month) {
                case 2:
                    // February has 29 days in leap years, and 28 days otherwise
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                default:
                    // All other months have 31 days
                    daysInMonth = 31;
                    break;
            }

            System.out.println("Number of days in the month: " + daysInMonth);
        } else {
            System.out.println("Invalid date");
        }

    }
}
