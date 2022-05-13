package com.javapracticeshiv;

import java.util.Arrays;

public class Chapter_6_pr_set {
    public static void main(String[] args) {
        //Question 1
        /*
        float[] numbers = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element: numbers){
            sum = sum + element;
        }
        System.out.println(sum);

        // using normal for loop
        float[] numbers = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float total = 0;
        for(float i = 0; i < numbers.length; i++){
        total += numbers[i]
        }
        System.out.println(total);

        //Question 2
        int[] numbers = {45, 67, 63, 99, 100};
        int num = 40;
        boolean isInArray = false;
        for(int element: numbers){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in array");
        }
        else{
            System.out.println("The value is not present in array");
        }

        // Question 3
        float[] numbers = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element: numbers){
            sum = sum + element;
        }
        System.out.println("The value of average length is " + sum/numbers.length);
     */

        //Question 4
        /* int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                        {3, 7, 1}};

         */
//        Question 5

//        int[] marks = {2, 3, 4, 5, 6, 7};
//        for (int i = marks.length-1; i>=0; i--){
//            System.out.println(marks[i]);
//        }
        int[] marks = {2, 3, 4, 5, 6, 7};
        int l = marks.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++){
            temp = marks[i];
            marks[i] = marks[l-1-i];
            marks[l-1-i] = temp;
        }
        for (int element :marks){
            System.out.print(element + " ");
        }




//        Question 6
        /*
        int[] marks = {2, -300, 4, 55, 6, 7};
        int max = Integer.MIN_VALUE;
        for (int element :marks){
            if(element>max){
                max = element;
            }
        }
        System.out.println("The maximum value is " + max);

         */

        //Question 7
        /*
        int[] marks = {2, -300, 4, 55, 6, 7};
        int min = Integer.MAX_VALUE;
        for (int element :marks){
            if (element<min){
                min = element;
            }
        }
        System.out.println("The minimum value is "+ min);

         */
        //Question 8

//        boolean isSorted = true;
//        int[] marks = {2, 3, 4, 55, 67, 70};
//        for (int i = 0; i < marks.length-1; i++) {
//            if (marks[i] > marks[i + 1]) {
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted){
//            System.out.println("The array is sorted");
//        }
//        else{
//            System.out.println("The array is not sorted");
//        }














    }
}
