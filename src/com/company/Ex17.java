package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 25/10/2016.
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dame un numero de máximo 5 cifras");
        String numero = scanner.next();

        if(numero.length()<=5 && numero.length()>=0) {

            for (int i = 0; i < numero.length(); i++) {
                for (int x = 0; x <= i; x++) {
                    System.out.print(numero.charAt(x));
                }
                System.out.println();

            }
        }else{
            System.out.println("404 He dicho de  MÁXIMO cifras");
        }




    }
}
