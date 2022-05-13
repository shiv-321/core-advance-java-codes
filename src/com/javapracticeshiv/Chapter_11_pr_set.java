package com.javapracticeshiv;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Pen is use for writing");
    }
    @Override
    void refill() {
        System.out.println("Refilling is cheaper than buying a new one");
    }
    void changeNib(){
        System.out.println("Can change nib in fountain pen");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
abstract class Telephone{
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}
class SmartPhone1 extends Telephone{

    @Override
    void ring() {
        System.out.println("Ringing");
    }

    @Override
    void lift() {
        System.out.println("lift");
    }

    @Override
    void disconnect() {
        System.out.println("disconnect");
    }
}
interface TvRemote{
    void on();
    void changeChanel();
}
interface SmartTvRemote extends TvRemote{

}
class Tv implements TvRemote{
    public void on(){
        System.out.println("Tv on");
    }
    public void changeChanel(){
        System.out.println("Changing chanel of TV");
    }
}
public class Chapter_11_pr_set {
    public static void main(String[] args) {
        System.out.println("******Question 1-2********");
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.refill();
        pen.write();

        System.out.println("*******Question 3*******");
        Human obj = new Human();
        obj.jump();
        obj.bite();
        obj.sleep();
        obj.eat();

        System.out.println("*******Question 5**********");
        Monkey monkey = new Human();
        monkey.bite();
        monkey.jump();

        System.out.println("*******Question 4**********");
        Telephone device = new SmartPhone1();
        device.ring();
        device.lift();
        device.disconnect();
    }
}
