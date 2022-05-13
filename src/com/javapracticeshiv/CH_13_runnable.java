package com.javapracticeshiv;

class MyThreadRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("I am a thread 1 not a threat");
        }
    }
}
class MyThreadRunnable2 implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I am a thread 2 not a threat");
            i++;
        }
    }
}

public class CH_13_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread thread1 = new Thread(t1);
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread thread2 = new Thread(new MyThreadRunnable2());

        thread1.start();
        thread2.start();
    }
}
