package com.javapracticeshiv;

class PracticeA extends Thread {
    public void run() {
        for (int i = 0; i < 4000; i++) {
            System.out.println("Good Morning");
        }
    }
}
class PracticeB extends Thread{
    public void run(){
        for (int i=0; i<4000; i++){
            System.out.println("Welcome");

            try{
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}
public class Chapter_13_pr_set_1 {
    public static void main(String[] args) {
        PracticeA t1 = new PracticeA();
        PracticeB t2 = new PracticeB();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

//        t1.start();
        t2.start();
        System.out.println(t2.getState()); // it will give runnable state
        System.out.println(Thread.currentThread().getState());
    }
}

