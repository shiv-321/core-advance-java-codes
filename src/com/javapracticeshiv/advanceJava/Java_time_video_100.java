package com.javapracticeshiv.advanceJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java_time_video_100 {
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
