package com.javapracticeshiv;

class MyNewTh1 extends Thread{
    public void run(){
        for (int i =0; i<5; i++){
            System.out.println("This is new thread one");
        }

    }
}
class MyNewTh2 extends Thread{
    public void run(){
        for (int i =0; i<5; i++){
            System.out.println("This is new thread two");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class Ch_13_Thread_Methods {
    public static void main(String[] args) {
        MyNewTh1 t1 = new MyNewTh1();
        MyNewTh2 t2 = new MyNewTh2();
        t1.start();
//
        t2.start();
    }

}
