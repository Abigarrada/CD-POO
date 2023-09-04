package com.campusdual;

public class Exercise2 {
    public static void main(String[] args) {
        //calcular área del círculo y longitud circunferencia

        int radius = 15;

        double a = Math.pow(radius, 2) * Math.PI;
        double l = 2 * radius * Math.PI;

        System.out.println("Radius: " + radius + ": Area: " + a + ", length " + l);
    }
}
