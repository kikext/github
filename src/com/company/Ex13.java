package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 21/10/2016.
 */
public class Ex13 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame un numero y te dire si es negativo o positivo \nEscribe un 0 si quieres cerrar el programa");

        do {
            num = scanner.nextInt();

            if (num > 0) {
                System.out.println(num + " Es Positivo");
            } else if (num < 0) {
                System.out.println(num + " Es Negativo");
            }
        }while(num!=0);

    }
}
