package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 20/10/2016.
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //------------------------VARIABLES-------------------------------------
        int cantidad = 0;
        int cont50 = 0;
        int cont20 = 0;
        int cont10 = 0;
        int cont5 = 0;
        int cont2 = 0;
        int cont1 = 0;

        //----------------------------------------------------------------------

        System.out.println("Introduce la cantidad de centimos de la cual deseas obtener el cambio: ");
            cantidad = scanner.nextInt();
do {
    if (cantidad - 50 >= 0) {

        cantidad=cantidad-50;
        cont50++;
    } else if (cantidad - 20 >= 0) {

        cantidad=cantidad-20;
        cont20++;
    } else if (cantidad - 10 >= 0) {

        cantidad=cantidad-10;
        cont10++;
    } else if (cantidad - 5 >= 0) {

        cantidad=cantidad-5;
        cont5++;
    } else if (cantidad - 2 >= 0) {

        cantidad=cantidad-2;
        cont2++;
    } else if (cantidad - 1 >= 0) {

        cantidad=cantidad-1;
        cont1++;
    }
}while (cantidad!=0);
        System.out.println("El cambio será: ");
        System.out.println(cont50+" monedas de 50");
        System.out.println(cont20+" monedas de 20");
        System.out.println(cont10+" monedas de 10");
        System.out.println(cont5+" mondeas de 5");
        System.out.println(cont2+" monedas de 2");
        System.out.println(cont1+" monedas de 1");
    }
}
