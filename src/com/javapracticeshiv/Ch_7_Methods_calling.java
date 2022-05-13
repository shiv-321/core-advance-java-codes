package com.javapracticeshiv;

public class Ch_7_Methods_calling {
    int logic(int x, int y) {
        int z;

        if (x > y) {
            z = (x + y);
        } else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c;
        // method invocation using object creation
        Ch_7_Methods_calling obj = new Ch_7_Methods_calling();
        c = obj.logic(a, b);
//        c = logic(a, b);

        int a1 = 10;
        int b1 = 7;
        int c1;
        Ch_7_Methods_calling obj1 = new Ch_7_Methods_calling();
        c1 = obj.logic(a1, b1);
//        c1= logic(a1, b1);

        System.out.println(c);
        System.out.println(c1);
    }
}

