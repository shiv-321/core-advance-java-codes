package com.javapracticeshiv;

public class Ch_7_methods_overloading2 {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    public static void main(String[] args) {
    foo();
    foo(3000);
    foo(3000, 4000);

    }

}
