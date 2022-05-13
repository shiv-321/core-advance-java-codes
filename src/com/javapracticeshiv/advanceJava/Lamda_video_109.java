package com.javapracticeshiv.advanceJava;
@FunctionalInterface
interface DemoAno{

    void meth1(int a);
//    void meth2();
}

//class shivFunc implements DemoAno{
//
//    @Override
//    public void meth1() {
//        System.out.println("This is method");
//    }
//}
public class Lamda_video_109 {
    public static void main(String[] args) {
        // Anonymous class
//        DemoAno ano = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth 1");
//            }
//
////            @Override
////            public void meth2() {
////                System.out.println("I am meth 2");
////            }
//        };
//        ano.meth1();
//        ano.meth2();

        // Lambda expression
//        DemoAno obj = new shivFunc();
//        obj.meth1();

        DemoAno obj = (a)->{
            System.out.println("I am meth 1" + a);
        };
        obj.meth1(6);

    }
}
