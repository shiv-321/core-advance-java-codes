package com.javapracticeshiv;

import java.awt.*;
import java.util.logging.Logger;

class Cylinder {
    private float radius;
    private float height;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2 * 3.14 * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
    class Rectangle{
        private int length;
        private int breadth;

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }

        public Rectangle() {
            this.length = 5;
            this.breadth = 4;
        }

        public Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }
    }
    class Sphere{
    private int radius;

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public double area(){
            return 4*Math.PI*radius*radius;
        }
        public double volume(){
            return (4*Math.PI*radius*radius*radius)/3;
        }
    }

public class Chapter_9_pr_set {
    public static void main(String[] args) {
        /*

        //Question 1
        Cylinder cylinder = new Cylinder();

        cylinder.setHeight(4.2f);
        cylinder.setRadius(3.3f);

        Logger.getGlobal().info(String.valueOf(cylinder.getHeight()));
        Logger.getGlobal().info(String.valueOf(cylinder.getRadius()));


        // Question 2
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(4.2f);
        myCylinder.setRadius(3.3f);

        double surfaceArea = myCylinder.surfaceArea();
        double volume = myCylinder.volume();

        Logger.getGlobal().info(String.valueOf(surfaceArea));
        Logger.getGlobal().info(String.valueOf(volume));


        //Question 3
        Cylinder c = new Cylinder(3.3f, 4.2f);

        Logger.getGlobal().info(String.valueOf(c.getRadius()));
        Logger.getGlobal().info(String.valueOf(c.getHeight()));

        //Question 4 // we need getter while using constructor but we don't need setter
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(5, 4);

        Logger.getGlobal().info(String.valueOf(rectangle.getLength()));
        Logger.getGlobal().info(String.valueOf(rectangle.getBreadth()));
        Logger.getGlobal().info(String.valueOf(rectangle1.getBreadth()));
        Logger.getGlobal().info(String.valueOf(rectangle1.getBreadth()));
         */
        //Question 5
        Sphere sphere = new Sphere();
        sphere.setRadius(12);

        Logger.getGlobal().info(String.valueOf(sphere.getRadius()));
        Logger.getGlobal().info(String.valueOf(sphere.area()));
        Logger.getGlobal().info(String.valueOf(sphere.volume()));




    }
}
