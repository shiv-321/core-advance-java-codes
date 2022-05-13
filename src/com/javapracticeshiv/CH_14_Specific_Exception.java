package com.javapracticeshiv;

import java.util.Scanner;

public class CH_14_Specific_Exception {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] =7;
        marks[1] =56;
        marks[2] =6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int number = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number1 = sc.nextInt();

        try{
            System.out.println("The value at array index entered is: " + marks[number]);
            System.out.println("The value of array value/number is: " + marks[number]/number1);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException exception occured");
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException exception occured");
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Some exception occured");
            System.out.println(e);
        }


    }
}
