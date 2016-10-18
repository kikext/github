package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 18/10/2016.
 */
public class Ex11 {

        public static void main(String[] args) {
            int cont = 10;
            Scanner scanner = new Scanner(System.in);
            int RandNum = (int) (100 * Math.random() + 1);

            System.out.println("Ulalá! Acierta el num: tienes del 1 al 100");
            for (int i = 0; i < 10; i++){
                System.out.println("Te quedan "+cont+" intentos, andate con ojo");
                int num = scanner.nextInt();
                if(num>RandNum){
                    System.out.println("LOCO! Te pasas we! ");

                }if(num<RandNum){
                    System.out.println("Asi no men, te has quedado corto");
                }if(num == RandNum){
                    System.out.println("BOOOOOM ACERTASTE!! el numero era: "+RandNum);
                    System.out.println("y te sobraron: "+cont+" turnos");

                    break;
                }if(cont == 0){
                    System.out.println("GAME OVER! te quedaste sin intentos");
                    System.out.println("El numero era: "+RandNum);
                }
            cont--;
            }

        }
    }
