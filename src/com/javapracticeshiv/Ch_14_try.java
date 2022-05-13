package com.javapracticeshiv;

public class Ch_14_try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The result is " + c);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("End of the program");
    }
}
