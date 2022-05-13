package com.javapracticeshiv.advanceJava;

import java.util.HashSet;

public class HashSet_video_95 {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>(5, 0.5f);
        myHashSet.add(6);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);

    }
}
