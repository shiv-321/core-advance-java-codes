package com.javapracticeshiv;

import java.util.Scanner;

class RetriesException extends Exception{
    @Override
    public String getMessage(){
        return "Error";
    }
}

public class Chapter_14_pr_set {
    public static void main(String[] args) {
        // syntax error
//        int a = 10  // syntax error: no semocolon
//        b = 20;     // syntax error: no variable declaration

        // logical error
        // write a program to find the odd number below 20
        int n=10;
        for (int i=1; i<n; i++){
            System.out.println(2*i);
        }

        // runtime error
//        int a = 10;
//        int b = 0;
//        int c = a/b;
//        System.out.println(c);

        // problem 2
        try{
            int x = 666/0;
        }catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }catch (ArithmeticException e){
            System.out.println("Haha");
        }

        // problem 3
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i =0;
        while(flag && i<5) {
            try {
                System.out.println("Enter the value of index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;

            }catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
            if (i>=5){
                try{
                    throw new RetriesException();
                }catch (RetriesException e){
                    System.out.println(e.getMessage());
                }

            }
        }

    }
}
