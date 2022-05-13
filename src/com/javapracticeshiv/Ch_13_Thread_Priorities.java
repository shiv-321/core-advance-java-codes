package com.javapracticeshiv;

class MyThPr extends Thread{
    MyThPr(String name){
        super(name);
    }
    public void run(){
        for (int i=0; i<5000; i++){
            System.out.println("Thank you" + this.getName());
        }
    }
}
public class Ch_13_Thread_Priorities {
    public static void main(String[] args) {

        MyThPr t1 = new MyThPr("Shiva");
        MyThPr t2 = new MyThPr("Ram");
        MyThPr t3 = new MyThPr("Hari");
        MyThPr t4 = new MyThPr("Sita");
        MyThPr t5 = new MyThPr("Geeta");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
