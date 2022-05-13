package com.javapracticeshiv;

class MyThreadExample implements Runnable{

//    public MyThreadExample(Runnable r, String name){
//        super(r, name)
//    }

    @Override
    public void run() {
        System.out.println("Task performed");
    }
}

public class Ch_13_Thread_Constructor_runnable {
    public static void main(String[] args) {
        MyThreadExample t1 = new MyThreadExample();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1, "Shivaraj's thread");
        thread1.start();
        thread2.start();
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());

    }
}
