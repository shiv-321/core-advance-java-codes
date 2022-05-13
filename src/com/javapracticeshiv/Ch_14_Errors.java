package com.javapracticeshiv;

import java.util.Scanner;

public class Ch_14_Errors {
    public static void main(String[] args) {
        //Syntax error demo
//        int a =0  error: no semicolon

        // logical error demo
        // write a program to print all prime numbers between 1 0 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        // Runtime Error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is" + 1000/k);

    }
}
