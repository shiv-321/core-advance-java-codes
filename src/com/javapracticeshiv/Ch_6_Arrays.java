package com.javapracticeshiv;

import java.util.Arrays;

public class Ch_6_Arrays {
    public static void main(String[] args) {

// there are 3 ways to create arrays
//         1. Declaration and then memory allocation
        int[] marks;
        marks = new int[5];
        marks[0] = 78;
        marks[1] = 86;
        marks[2] = 98;
        marks[3] = 87;
        marks[4] = 89;
        System.out.println(marks[2]);

        // 2. Declaration and memory allocation
//        int[] marks = new int[5];
//        marks[0] = 78;
//        marks[1] = 86;
//        marks[2] = 98;
//        marks[3] = 87;
//        marks[4] = 89;
//        System.out.println(marks[0]);

        // 3. Declaration and initialization together
//        int [] marks = {78, 86, 98, 87, 89};
//        System.out.println(marks[3]);
//        System.out.println(marks.length);

// Array continue(Array length)

//        int [] marks = {78, 86, 98, 87, 89};
//        float [] marks = {78.5f, 86.5f, 98.0f, 87.5f, 89.5f};
//        String [] students = {"Shiva","Lacy", "Elli", "Dany", "Mathew"};
//        System.out.println(students[3]);
//        System.out.println(students.length);

        // Displaying array
//        int [] marks = {78, 86, 98, 87, 89};
//        System.out.println(marks[3]);

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//        System.out.println(Arrays.toString(marks));

// Displaying array (for loop)
//        int [] marks = {78, 86, 98, 87, 89};
//        for(int i = 0; i < marks.length; i++){
//            System.out.println(marks[i]);
//        }

        // printing array in reverse order
//        int [] marks1= {78, 86, 98, 87, 89};
//        for(int i = marks1.length-1; i>=0; i--){
//            System.out.println(marks1[i]);

//        }
        //displaying array using for each loop:
        int[] marks1 = {78, 86, 98, 87, 89};
        for (int element : marks1) {
            System.out.println(element);


        }
    }
}
