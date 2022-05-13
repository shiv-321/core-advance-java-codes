package com.javapracticeshiv;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){

        System.out.println("I am a base class");
    }
}
class Derived extends Base{
    int y;

    public int getY(){

        return y;
    }

    public void setY(int y) {

        this.y = y;
    }
}
public class Ch_10_Inheritance {
    public static void main(String[] args) {
       // creating an object of base class
        Base b = new Base();
//        b.x = 10; // we can do both ways because the field is public
        b.setX(4);
        System.out.println(b.getX());
//        System.out.println(b.x);
/** we can not get Y using base object but we can get X and Y both in Derived object
 * Because Base is super class and Derived is subclass
 * Base class is parent class and Derived class is child class
 */

        //creating an object of derived class
        Derived d = new Derived();
        d.setX(43);
        d.setY(6);
        System.out.println(d.getX());
        System.out.println(d.getY());
        d.printMe();


    }


}
