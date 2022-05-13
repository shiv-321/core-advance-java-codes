package com.javapracticeshiv;
class MyMainEmployee {
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee(){
        id = 45;
        name = "Shivaraj";
    }
    public MyMainEmployee(String name){

        this.name  = name;

    }
    public MyMainEmployee(String name, int id){
        this.id = id;
        this.name  = name;

    }
    public MyMainEmployee(String name, int id, int salary){
        this.id = id;
        this.name  = name;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class Ch_9_Constructor {


    public static void main(String[] args) {
        MyMainEmployee employee1 = new MyMainEmployee("Shivaraj", 30, 10000);
//        MyMainEmployee employee2 = new MyMainEmployee("Bob");

        System.out.println(employee1.getName());
        System.out.println(employee1.getId());
        System.out.println(employee1.getSalary());
    }
}
