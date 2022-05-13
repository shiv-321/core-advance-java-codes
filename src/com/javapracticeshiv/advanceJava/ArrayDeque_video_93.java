package com.javapracticeshiv.advanceJava;

import java.util.ArrayDeque;

public class ArrayDeque_video_93 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(16);
        ad1.add(116);
        ad1.add(1116);

        ad1.addFirst(10);
        ad1.addLast(100);

        System.out.println(ad1);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
