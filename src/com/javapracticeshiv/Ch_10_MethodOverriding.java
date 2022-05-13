package com.javapracticeshiv;

class Apple{
    public int a;
    public int shiv(){
        return 3;
    }
    public void  meth2(){

        System.out.println("I am method 2 of class Apple");
    }
}
class Ball extends Apple {

    @Override
    public void meth2() {
        System.out.println("I am method 2 of class Ball");
    }

    public void meth3(){
        System.out.println("I am meth3 of class Ball");
    }


}
public class Ch_10_MethodOverriding {
    public static void main(String[] args) {
//            Apple a = new Apple();
//            a.meth2();

        Apple a1 = new Ball();
        a1.meth2();
        a1.shiv();




    }



}
