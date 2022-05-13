package com.javapracticeshiv;

public class Ch_7_methods_overloading {

//    static void tellJoke(){
//        System.out.println("I invented a new world");
//
//    }
//
//    public static void main(String[] args) {
//        tellJoke();
//      }

    //process of method invocation
//    int sum(int a, int b){
//        return a + b;
//
//    }
//
//    public static void main(String[] args) {
//
//        Ch_7_methods_overloading obj = new Ch_7_methods_overloading();
//        int c = obj.sum(2, 3);
//        System.out.println(c);
//    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }

    public static void main(String[] args) {
//        int [] marks = {52, 77, 45, 70, 80};
        //changing the integer
//        int x = 45;
//        change(x);
//        System.out.println(x);
        // changing the array
        int [] marks = {52, 77, 45, 70, 80};
        change2(marks);
        System.out.println(marks[0]);
    }

    }




