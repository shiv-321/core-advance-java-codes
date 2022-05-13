package com.javapracticeshiv;
//
//class Employee1{
//    int salary;
//    String name;
//
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String  n){
//        name = n;
//    }

//    class Cellphone{
//        public void ring(){
//            System.out.println("Ringing...");
//        }
//        public void vibrate(){
//            System.out.println("Vibrating...");
//        }
//        public void callFriend(){
//            System.out.println("Calling");
//        }
//    }

//    class Square{
//        int side;
//        public int area(){
//            return side * side;
//        }
//        public int perimeter(){
//            return 4 * side;
//        }
//    }

//    class Rectangle{
//        int length;
//        int breath;
//
//        public int area(){
//            return length * breath;
//        }
//        public int perimeter(){
//            return 2*(length + breath);
//        }
//    }

//    class TommyVecciti{
//        public void hit(){
//            System.out.println("Hitting");
//        }
//        public void run(){
//            System.out.println("running");
//        }
//        public void fire(){
//            System.out.println("firing");
//        }
//    }

    class Circle{
        int r;
        float pi;
        public float area(){
            return pi * r * r;
        }
        public float perimeter(){

            return 2 * pi * r;
        }

    }




public class Chapter_8_pr_set {
    public static void main(String[] args) {

        //Question 1
//        Employee1 shivaraj = new Employee1();
//        shivaraj.setName("Shivaraj Thapa");
//        shivaraj.salary = 233;
//        String shivaName = shivaraj.getName();
//        System.out.println(shivaName);
//        System.out.println(shivaraj.getSalary());


        //Question 2
//        Cellphone ipnone = new Cellphone();
//        ipnone.ring();
//        ipnone.vibrate();
//        ipnone.callFriend();

        //Question 3
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        // Question 4
//        Rectangle rec = new Rectangle();
//        rec.length = 5;
//        rec.breath = 4;
//        System.out.println(rec.area());
//        System.out.println(rec.perimeter());

        //question 5
//        TommyVecciti tommy = new TommyVecciti();
//        tommy.hit();
//        tommy.run();
//        tommy.fire();

        // Question 6
        Circle calc = new Circle();
        calc.pi = 3.14f;
        calc.r = 5;
        System.out.println(calc.area());
        System.out.println(calc.perimeter());





    }
}
