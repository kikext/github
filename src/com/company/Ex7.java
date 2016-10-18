package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 18/10/2016.
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long operaçao = 1;
        for (int i = 1; i <= 20; i++) {
            operaçao = operaçao*i;
            System.out.println(operaçao);

        }

    }
}
