package com.javapracticeshiv;

import java.util.Scanner;

public class Ch_14_nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] =7;
        marks[1] =56;
        marks[2] =6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int ind = sc.nextInt();

        try{
            System.out.println("Welcome to java programming");
            try{
                System.out.println(marks[ind]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("sorry this index does not exit");
                System.out.println("Exception in level two");
            }
        }catch(Exception e){
            System.out.println("Exception in level one");
        }
    }
}
