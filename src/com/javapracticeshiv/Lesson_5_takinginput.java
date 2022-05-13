package com.javapracticeshiv;
import java.util.Scanner;


public class Lesson_5_takinginput {
    public static void main(String[] args) {

        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
//        int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
//        int b = sc.nextInt();
        float b = sc.nextFloat();

//        int sum = a + b;
        float sum = a + b;
        System.out.println("The sum of these number is");
        System.out.println(sum);

//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

        String str = sc.next(); // gives the first word of the line
        System.out.println(str);

        String str1 = sc.nextLine(); // give the full line
        System.out.println(str1);


    }
}
