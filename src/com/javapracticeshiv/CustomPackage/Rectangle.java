package com.javapracticeshiv.CustomPackage;

public class Rectangle extends Shape{

    Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }
    public int area(int dim1, int dim2){
        return dim1*dim2;
    }
}
