package com.javapracticeshiv.advanceJava;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendar_video_99 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));


        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2022));
        System.out.println(cal.isLeapYear(2020));

        System.out.println(TimeZone.getAvailableIDs()[0]);


        String[] id = TimeZone.getAvailableIDs();
        for (int i=0; i< id.length; i++){
            System.out.println(id[i]);
        }
    }
}
