package com.javapracticeshiv;

abstract class Parent2{
    public Parent2(){
        System.out.println("I am constructor of base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class Ch_11_abstractClass {
    public static void main(String[] args) {
//        Parent2 p = new Parent2(); // not allowed
        Child2 c2 = new Child2(); // allowed
//        Child3 c3 = new Child3();  // not allowed


    }

}
