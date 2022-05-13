package com.javapracticeshiv;

public class Chapter_3_pr_set {
    public static void main(String[] args) {
        //Question 1
        String name = "Shivaraj Thapa";
        System.out.println(name.toLowerCase());

        //Question 2
        System.out.println(name.replace(' ','_'));

        //Question 3
        String letter = "Dear <|Name|>, Thanks a lot";
        System.out.println("Dear " + name + ", Thanks a lot");

        //Question 4
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

        //Question 5
        String myLetter = "Dear Shivaraj, This Java course is nice and easy to learn. Thanks!";
        myLetter = "Dear Shivaraj, \n\tThis Java course is nice and easy to learn. \nThanks!";
        System.out.println(myLetter);

    }
}
