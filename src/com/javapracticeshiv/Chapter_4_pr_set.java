package com.javapracticeshiv;
import java.util.Scanner;

public class Chapter_4_pr_set {
    public static void main(String[] args) {
        //Question 1
//        int a = 10;
//        if(a = 11);
//        {
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }
        // It gives an error because there must to == in if condition.

        //Question 2
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the marks of English");
//        int marks1 = sc.nextInt();
//        System.out.println("Enter the marks of Chinese");
//        int marks2 = sc.nextInt();
//        System.out.println("Enter the marks of Spanish");
//        int marks3 = sc.nextInt();
//
//        float avgmarks = (marks1+marks2+marks3)/3.0f;
//        System.out.println("Your average marks is " + avgmarks);
//
//        if(avgmarks >= 40 && marks1 >=33 && marks2 >= 33 && marks3 >= 33){
//            System.out.println("You are passed");
//        }
//        else{
//            System.out.println("You are failed, tyr again");
//        }
        //Question 2
//        Scanner sc = new Scanner(System.in);
//        byte m1, m2, m3;
//
//        System.out.println("Enter you marks of Physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter you marks of Chemistry");
//        m2 = sc.nextByte();
//
//        System.out.println("Enter you marks of Biology");
//        m3 = sc.nextByte();
//
//        float averageMarks = (m1+m2+m3)/3.0f;
//        System.out.println("Your average score is " + averageMarks);
//
//        if(averageMarks >= 40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("COngratulations! You have passed!");
//        }
//        else{
//            System.out.println("Please try again, you are not passed");
//        }
        //Question 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in laks");
        float tax = 0;
        float income = sc.nextFloat();


        if(income < 2.5){
            tax = tax + 0;
        }
        if(income > 2.5f && income <= 5.0f){
            tax = tax + 0.05f*(income - 2.5f);
        }
        else if(income > 5.0f && income <= 10.0f){
            tax = tax + 0.05f*(5.0f -2.5f);
            tax = tax + 0.2f*(income-5f);
        }
        else if(income >10){
            tax = tax + 0.05f *(5.0f - 2.5f);
            tax = tax + 0.2f *(10.0f - 5f);
            tax = tax + 0.05f *(income - 10.0f);
        }
        System.out.println("Your total tax of the employer is " + tax);

// Question 4
//        byte day = 1;
//        switch (day){
//            case 1 -> System.out.println("Sunday");
//            case 2 -> System.out.println("Monday");
//            case 3 -> System.out.println("Tuesday");
//            case 4 -> System.out.println("Wednesday");
//            case 5 -> System.out.println("Thursday");
//            case 6 -> System.out.println("Friday");
//            case 7 -> System.out.println("Saturday");
//        }


        //Question 6
//        System.out.println("Enter the website");
//
//        Scanner sc = new Scanner(System.in);
//        String website = sc.nextLine();
//
//        if(website.endsWith(".com")){
//            System.out.println("This is an commercial website");
//        }
//        else if(website.endsWith(".org")){
//            System.out.println("This is an organizational website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }


    }
}
