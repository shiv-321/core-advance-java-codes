package com.javapracticeshiv;

public class Chapter_7_pr_set {
    static void multiplication(int n){
        for(int i =1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }
    static void pattern1(int n){
        for(int i = 0; i <n; i++){
            for(int j=0; j<i+1; j++)
                System.out.print("*");
        }
        System.out.println();
    }

    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + sumRec(n-1);
                }
            }
            static int fib(int n){
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    static void pattern2_rec(int n){
        if(n>0){
            pattern2_rec(n-1);
            for(int i = 0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Question 1
//        multiplication(7);

        //Question2
//        pattern1(4);

        //Question 3
//        int c = sumRec(3);
//        System.out.println(c);

        //Question 4

        //Question 5
//        int result = fib(5);
//        System.out.println(result);

        //Question 6
        pattern2_rec(4);

    }
}
