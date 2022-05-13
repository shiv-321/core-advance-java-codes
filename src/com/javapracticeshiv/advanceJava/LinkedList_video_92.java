package com.javapracticeshiv.advanceJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_video_92 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l1.addLast(100);  // can not find this method in ArrayList
        l1.addFirst(500);

//        for (int i=0; i<l1.size(); i++){
//            System.out.println(i);
//        }

        l1.add(5, 9);
        l1.add(0, 8);

        l1.addAll(l2);
//        l1.clear();
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(20));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,500);

//        System.out.println(l1);
        for (int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));

        }

    }
}
