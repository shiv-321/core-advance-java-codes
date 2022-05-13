package com.javapracticeshiv.advanceJava;

import java.util.Date;

public class DateClass_video_97 {
    public static void main(String[] args) {

//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getDay());
    }
}
