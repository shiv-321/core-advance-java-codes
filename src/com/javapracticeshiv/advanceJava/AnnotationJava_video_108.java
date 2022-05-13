package com.javapracticeshiv.advanceJava;

import com.javapracticeshiv.Ch_10_Dynamic_Method_Dispatch;

@FunctionalInterface
interface myFunctionalInterface{
    public int multiply();
}
class NewPhone extends Ch_10_Dynamic_Method_Dispatch {
    @Override
    public void showTime(){
        System.out.println("8 PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class AnnotationJava_video_108 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();

        System.out.println(phone.sum(4,5));


    }
}
