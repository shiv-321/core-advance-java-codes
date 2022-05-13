package com.javapracticeshiv;
import java.util.Scanner;

public class Ch_4_operators_if_clause {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 56){
            System.out.println("You are experienced");
        }
        else if(age > 46){
            System.out.println("You are semi-experienced");
        }
        else if(age > 36){
            System.out.println("Your are semi-semi-experienced");
        }
        else {
            System.out.println("Your are not experienced");
        }

    }
}
