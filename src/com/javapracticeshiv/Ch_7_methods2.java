package com.javapracticeshiv;

public class Ch_7_methods2 {
    static int mySum(int a, int b){
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int z = mySum(x, y);

        int x1 = 10;
        int y1 = 10;
        int z1;
        z1 = mySum(x1, y1);

        System.out.println(z);
        System.out.println(z1);



    }
}
