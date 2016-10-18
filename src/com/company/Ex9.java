package com.company;

import java.util.Scanner;

/**
 * CJUEPUTAreated by 25374183P on 18/10/2016.
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min= 2147483647;
        int total = 0;
        int contador = 0;

        for (int i = 0; i <= 1000; i++) {

            System.out.println("Dame un valor:");
                int var = scanner.nextInt();

            if (var == 999) {
                break;
            }
            if (var < min) {
                min = var;

            }
            if (var > max) {
                max = var;

            }
            total = total + var;
            contador++;

        }

        int avg = total / contador;

        System.out.println("El valor maximo es: "+max);
        System.out.println("El valor minimo es: "+min);
        System.out.println("La media es: "+avg);
    }
}
