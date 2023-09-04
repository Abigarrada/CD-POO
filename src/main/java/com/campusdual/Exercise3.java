package com.campusdual;

public class Exercise3 {

    public static void main(String[] args) {
        int result = Exercise3.function(5, 4);
        System.out.println("New value: " + result);
        Exercise3.procedure();
    }

    public static Integer function(int n1, int n2){
        int add = n1 + n2;
        return add;
    }

    public static void procedure(){
        System.out.println("Patatillas");
    }

}
