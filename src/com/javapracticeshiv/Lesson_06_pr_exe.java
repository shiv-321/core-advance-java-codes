package com.javapracticeshiv;
import java.util.Scanner;

public class Lesson_06_pr_exe {
    public static void main(String[] args) {

        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1: ");
        int sub1 = sc.nextInt();

        System.out.println("Enter the marks of subject 2: ");
        int sub2 = sc.nextInt();

        System.out.println("Enter the marks of subject 3: ");
        int sub3 = sc.nextInt();

        System.out.println("Enter the marks of subject 4: ");
        int sub4 = sc.nextInt();

        System.out.println("Enter the marks of subject 5: ");
        int sub5 = sc.nextInt();

        int percentage = (sub1 + sub2 + sub3 + sub4 + sub5)/5;
        System.out.println("The percentage of the student is: ");
        System.out.println(percentage);

    }
}
