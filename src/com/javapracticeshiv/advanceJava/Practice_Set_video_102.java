package com.javapracticeshiv.advanceJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Practice_Set_video_102 {
    public static void main(String[] args) {

        // Problem 1
        List<String> students = new ArrayList<>();
        students.add("Shiv");
        students.add("Rob");
        students.add("Bob");
        students.add("G-bob");
        students.add("Easi");
        students.add("Balen");
        students.add("Manas");
        students.add("Girish");
        students.add("Babu");
        students.add("Hopack");

        for (String student :students){
            System.out.println(student);
        }

        //Problem 2
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // problem 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));


        // Problem 4
        LocalDateTime dt = LocalDateTime.now();
        String time = dt.format(DateTimeFormatter.ofPattern("hh:m:s"));
        System.out.println(time);

        // Problem 5
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(10);
        System.out.println(hashSet);








    }
}
