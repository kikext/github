package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 21/10/2016.
 */
public class Ex14 {
    public static void main(String[] args) {
        int num=0;
        int suma=0;
        int cont=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numeros \nEso si, si me pones uno negativo el programa acabará");

        do {
            System.out.println("Dame un numero: ");
            if(num>=0)
            num = scanner.nextInt();
            suma=suma+num;
            cont++;

        }while(num>=0);
        int media = suma/cont;
        System.out.println("has introducido "+cont+" y la media de estos es: "+media);

    }

}
