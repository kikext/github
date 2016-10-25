package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 25/10/2016.
 */
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dame un numero de máximo 5 cifras");
        String numero = scanner.next();

        if (numero.length() <= 5 && numero.length() >= 0) {

            for (int i=numero.length()-1; i>=0; i--) {
                for (int x = i; x < numero.length(); x++) {
                    System.out.print(numero.charAt(x));
                }
                System.out.println();

            }
        } else {
            System.out.println("404 He dicho de  MÁXIMO cifras");
        }

    }
}
