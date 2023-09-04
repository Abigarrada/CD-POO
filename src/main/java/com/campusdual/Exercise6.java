package com.campusdual;

import java.util.Calendar;

public class Exercise6 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int month = cal.get(Calendar.MONTH) + 1;

        int hour = cal.get(Calendar.HOUR_OF_DAY);

        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Autumn");
                break;
            default:
                throw new IllegalArgumentException("Unexisting month");
        }

        switch (hour){
            case 0:
                System.out.println("Midnight");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Night");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Morning");
                break;
            case 12:
            case 13:
                System.out.println("Noon");
                break;
            case 14:
            case 15:
            case 16:
                System.out.println("Afternoon");
                break;
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Evening");
                break;
            case 21:
            case 22:
            case 23:
                System.out.println("Night");
                break;
            default:
                throw new IllegalArgumentException("Unexisting hour");
        }

    }

}
