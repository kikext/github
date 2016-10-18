package com.company;

/**
 * Created by 25374183P on 14/10/2016.
 */



import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = 0;
        System.out.println("Dame un numero: ");
            int num = scanner.nextInt();


            for(int i=1;i<(num+1);i++){
                if(num%i==0){
                    var++;
                }
            }
            if(var!=2){
                System.out.println("No es Primo");
            }else{
                System.out.println("Es Primo");
            }
     }
}

