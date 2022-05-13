package com.javapracticeshiv;

public class Ch_7_Methods1 {
    static int logic(int x, int y) {
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
        c = logic(a, b);
//        int c = logic(5, 7); --> this is also possible

        int a1 = 10;
        int b1 = 7;
        int c1;
        c1= logic(a1, b1);

        System.out.println(c);
        System.out.println(c1);
    }
}





