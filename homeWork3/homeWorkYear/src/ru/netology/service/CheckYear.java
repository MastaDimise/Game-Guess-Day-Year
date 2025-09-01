package ru.netology.service;

public class CheckYear {
    public static final int YEARSDAYS = 365;
    public static final int LEAPYEARSDAYS = 366;
        public static int checkYear(int year, int day){
            int score = 0;
        if(year % 400 ==0) {
            score = (day == LEAPYEARSDAYS) ? 1 : 0;
            //System.out.println("В " + year + " году 366 дней!");
        } else if (year % 100 == 0) {
            score = (day == LEAPYEARSDAYS) ? 1 : 0;
            //System.out.println("В " + year + " году 366 дней!");
        } else if (year % 4 == 0) {
            score = (day == LEAPYEARSDAYS) ? 1 : 0;
            //System.out.println("В " + year + " году 366 дней!");
        } else
            score = (day == YEARSDAYS) ? 1 : 0;
            //System.out.println("В " + year + " году 365 дней!");
        return score;
        }
}

