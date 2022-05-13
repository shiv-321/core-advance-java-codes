package com.javapracticeshiv;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Ch_8_custom_class {

    public static void main(String[] args) {

        System.out.println("This is our custom class");
        Employee shiv = new Employee(); // instantiating a new employee object
        Employee john = new Employee(); // instantiating a new employee object
        // setting properties/attributes
        shiv.id = 12;
        shiv.name = "Shiv";
        shiv.salary=1200;
        john.id = 14;
        john.name = "John";
        john.salary = 1000;

        //printing the attributes
//        System.out.println(shiv.id);
//        System.out.println(shiv.name);
        shiv.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);

    }
}
