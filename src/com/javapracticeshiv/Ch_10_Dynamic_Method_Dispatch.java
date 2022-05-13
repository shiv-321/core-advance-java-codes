package com.javapracticeshiv;

class Phone{
    public void greet(){

        System.out.println("Good morning");
    }
    public void on(){

        System.out.println("Turning on phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    @Override
    public void on(){
        System.out.println("Turning on smartphone");
    }
}
public class Ch_10_Dynamic_Method_Dispatch {
    public void showTime(){

        System.out.println("8 AM");
    }
    public static void main(String[] args) {
//        Phone obj = new Phone(); // allowed
//        SmartPhone smobj = new SmartPhone(); // allowed
//        obj.name();

        Phone obj1 = new SmartPhone(); // allowed
//        SmartPhone obj2 = new Phone(); // not allowed
        obj1.greet();
        obj1.on();
       // obj1.music // not allowed


    }
}
