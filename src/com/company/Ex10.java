package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 18/10/2016.
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int RandNum = (int) (100 * Math.random() + 1);

        System.out.println("Ulalá! Acierta el num: tienes del 1 al 100");
        for (int i = 0; i <= 1000; i++){
            int num = scanner.nextInt();
            if(num>RandNum){
                System.out.println("LOCO! Te pasas we! TRY AGAIN");

            }if(num<RandNum){
                System.out.println("Asi no men, te has quedado corto, TRY AGAIN");
            }if(num == RandNum){
                System.out.println("BOOOOOM ACERTASTE!!");
                break;
            }
        }

    }
}
