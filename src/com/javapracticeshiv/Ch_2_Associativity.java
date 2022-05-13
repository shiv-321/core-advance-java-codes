package com.javapracticeshiv;

public class Ch_2_Associativity {
    public static void main(String[] args) {

//        int a = 5*6 - 9/3;
        /*
        = 30 - 9/3
        = 30 - 3
        = 27
        */

//        int b = 60/10 - 2*3;
         /*
        = 6 - 2*3
        = 6 - 6
        = 0
        Highest precedence goes to * and /. They then evaluated in the basis of left to right associativity.
        */

        // Quick quiz
//        int x = 6;
//        int y = 1;
//        int k = x * y/2;


        int a = 4;
        int b = 3;
        int c = 5;
        int d = 4;
        int y = b*b - (4*a*c)/(2*a);
        System.out.println(y);

    }
}
