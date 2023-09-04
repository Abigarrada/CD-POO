package com.campusdual;

public class Exercise5 {

    public static void main(String[] args) {

        Exercise5.isItPositive(5);
        Exercise5.isItAMultipleOf(62,4);
        Exercise5.isItLowerThan(21,53);

    }

    public static void isItPositive(int n){
        if(n>=0){
            System.out.println("The number " + n + " is positive");
        }else{
            System.out.println("The number " + n + " is negative");
        }
    }

    public static void isItAMultipleOf(int n1, int n2){
        if (n1 % n2 == 0){
            System.out.println("The number " + n1 + " is a multiple of " + n2);
        } else {
            System.out.println("The number " + n1 + " is not a multiple of " + n2);
        }
    }

    public static void isItLowerThan(int n1, int n2){
        if(n1 < n2){
            System.out.println("The number " + n1 + " is smaller than " + n2);
        } else {
            System.out.println("The number " + n2 + " is smaller than " + n1);
        }
    }


}
