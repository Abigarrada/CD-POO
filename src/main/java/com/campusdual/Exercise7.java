package com.campusdual;

public class Exercise7 {
    public static void main(String[] args) {

        //mostrar primeros 15 números
        for (int i = 0; i <=15 ; i++) {
            System.out.println(i);
        }

        //sumar 100 primeros números naturales
        int add = 0;

        for (int i = 0; i <= 100; i++) {
            add = add + i;
        }

        System.out.println("Result: " + add);

        //variable va a incrementar menos de 20 veces y decir cuántas veces se pasa por el bucle

        int i = 0;
        int iterac = 0;

        while(i < 20){
            i++;
            iterac++;
        }

        System.out.println("Número de interaciones: " + iterac);

    }
}
