package com.javapracticeshiv.advanceJava;

import java.io.FileWriter;

// Question 2
//class MyDeprecated{
//    @Deprecated
//    void meth1(){
//        System.out.println("I am method 1");
//    }
    // Question 4
@FunctionalInterface
interface MyInterface {
        void drive();
    }

public class Practice_Set_video_112 {
    public static void main(String[] args) {
        // Question 1
        // Go to JavaDoc_video_106

        // Question 2
//        @SuppressWarnings("depricaiton")
//                MyDeprecated d = new MyDeprecated();
//                d.meth1();

                //There is no as such special effect on the program of deprecated annotation. The only thing is that compiler generated a waning if we use deprecated method or class in our program.


            //Question 3

            // Question 4

//        MyInterface obj = ()-> {
//            System.out.println("I am driving slow");
//        };
//        obj.drive();

// Question 5
        int i = 10;
        String table = "";
        for (int j=1; j<=10; j++){
            table += i + "X" + j + "=" + i*j;
            table += "\n";
        }
        try{
            FileWriter fileWriter = new FileWriter("Multiplication_table.txt");
            fileWriter.write(table);
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        }
    }

