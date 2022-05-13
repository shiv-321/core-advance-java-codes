package com.javapracticeshiv.advanceJava;
class MyGenerics<T,K>{
    int val;
    private T t;
    private K k;
    public MyGenerics(int val, T t, K k){
        this.val = val;
        this.t = t;
        this.k = k;
    }

    public K getK() {
        return k;
    }

    public int getVal() {
        return val;
    }

    public T getT() {
        return t;
    }
}
public class GenericJava_video_110 {
    public static void main(String[] args) {
        MyGenerics<String, Integer> a = new MyGenerics<>(23, "My generics", 100);
        System.out.println(a.getT());
        System.out.println(a.getK());
        System.out.println(a.getVal());
    }
}
