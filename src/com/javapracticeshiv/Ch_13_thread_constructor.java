package com.javapracticeshiv;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        for (int i=0; i<1000; i++){
            System.out.println("I am a thread");
        }
    }
}


public class Ch_13_thread_constructor {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Shivaraj");
        t1.start();
        System.out.println("The id if the thread t1 is " + t1.getId());
        System.out.println("The id if the thread t1 is " + t1.getName());

    }
}
