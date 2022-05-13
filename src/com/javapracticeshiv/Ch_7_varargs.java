package com.javapracticeshiv;

public class Ch_7_varargs {
//    static int sum(int a, int b){
//        return a + b;
//    }
//    static int sum(int a, int b, int c){
//        return a + b +c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a + b +c + d;
//    }
    static int sum(int x, int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to varargs tutorial");
        System.out.println("The sum of 4, and 5 is " + sum(4, 5));
        System.out.println("The sum of 4, 3 and 5 is " + sum(4, 3,5));
        System.out.println("The sum of 4, 3, 6 and 5 is " + sum(4, 3, 6,5));
// at least one variable should pass, cannot send empty function

    }
}
