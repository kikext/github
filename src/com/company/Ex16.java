package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 21/10/2016.
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sueldo = 0;
        int empleado =1;

        System.out.println("Cuantos sueldos deseas poner?");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el sueldo del empleado: "+empleado++);
            int Nsueldo = scanner.nextInt();
            if (sueldo < Nsueldo) {
                sueldo = Nsueldo;
            }
        }
        System.out.println("El sueldo mas grande introducido es: " + sueldo);

    }
}
