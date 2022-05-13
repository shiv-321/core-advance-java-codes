package com.javapracticeshiv.advanceJava;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClass_video_98 {
    public static void main(String[] args) {

//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());

        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.WEEK_OF_MONTH));


    }

}
