package com.javapracticeshiv;

public class Ch_5_continue {
    public static void main(String[] args) {
//        for(int i = 0; i<5; i++){
//            if(i==2) {
//                System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great");
//            }

//            int i = 0;
//
//            while(i<5){
//                i ++;
//                if(i ==2) {
//                    System.out.println("Ending the loop");
//                    continue;
//                }
//                System.out.println(i);
//                System.out.println("Java is great");
//
//                }


            int i = 0;
            do {
                i++;
                if (i == 2) {
                    System.out.println("Ending the loop");
                    continue;
                }
                System.out.println(i);
                System.out.println("Java is great");

            }while(i<5);
            System.out.println("Loop ends here");
        }
    }


