package com.javapracticeshiv;
class Circle1{
    private int radius;

    public Circle1(){
        System.out.println(" I am empty constructor");
    }

    public Circle1(int radius) {
        this.radius = radius;
        System.out.println("I am constructor with radius parameter");
    }
    public double area(){
        return Math.PI * this.radius*this.radius;
    }
    public double getArea(){
        return Math.PI * this.radius*this.radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
class Cylinder1 extends Circle1{
    private int height;

    public Cylinder1(int radius, int height) {
        super(radius);
        this.height = height;
        System.out.println("I am cylinder parameterized constructor");
    }
    public double volume(){
        return Math.PI * super.getRadius() * super.getRadius() * this.height;
    }

}
public class Chapter_10_pr_set {
    public static void main(String[] args) {
        Circle1 obj1 = new Circle1(6);
        System.out.println(obj1.getRadius());
//        double areaCalculation = obj1.getArea();
//        System.out.println(String.format("The area of circle is: %8.2f",areaCalculation));
//
//        Cylinder1 obj2 = new Cylinder1(6, 5);
//        obj2.volume();
//        System.out.println(String.format("The volume of cylinder is: %8.2f", obj2.volume()));


    }
}
