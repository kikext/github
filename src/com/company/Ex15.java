package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 21/10/2016.
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero;
        System.out.println("Dame un numero entre 0 y 99999 (5 cifras ;D )");


        do {
            numero = scanner.next();
            if (numero.length() <= 5) {
                System.out.println("El numero introducido tiene "+numero.length()+" Carácteres");
            } else {
                System.out.println("te has pasado, he dicho 5 cifras y has introducido " + numero.length() + "\nVenga vuelve a intentarlo");
            }
        }while (numero.length() > 5) ;
        }
    }



