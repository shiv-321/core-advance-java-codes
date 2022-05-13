package com.javapracticeshiv;

class Base1{
    public int x;
    Base1(){
        System.out.println("I am a base class constructor");
    }
    Base1(int x){

        System.out.println("I am a base class constructor with value of x: " + x);
    }
}
class Derived1 extends Base1{
    public int y;
    Derived1(){
//        super(0);
        System.out.println("I am derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        this.y = y;
        System.out.println("I am derived class constructor with value of y as "+y);
    }
}
class ChildOfDerived extends Derived1{
    int z;
    ChildOfDerived(){

        System.out.println("I am the constructor of ChildOfDerived class");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        this.z = z;
        System.out.println("I am the constructor of ChildOfDerived class with value of z as " + z);
    }
}
public class Ch_10_Constructor_In_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(2,5);
        ChildOfDerived cd = new ChildOfDerived(2,4,6);
//        ChildOfDerived cd = new ChildOfDerived();



    }
}
