package com.javapracticeshiv;

class EkClass{
    String name;
    String address;
    int salary;

    public String getName() {

        return name;
    }

    public EkClass(){

        this.name = "Shivaraj Thapa";
        System.out.println("My name is " + this.name);
    }
    public EkClass(String address){
        this.address = address;
        System.out.println("This is my address: " + address);
    }

    public int returnOne(){

        return 1;
    }
}

class Another extends EkClass{
Another(String address, int salary){
    super(address);
    this.salary = salary;
    System.out.println("I am a constructor with address and salary: " + address + " " + salary);
}
}
public class Ch_10_This_Supper {
    public static void main(String[] args) {
//        EkClass e = new EkClass();
//        EkClass e1 = new EkClass("Saginaw");
        Another a = new Another("Texas", 5000);



    }
}
