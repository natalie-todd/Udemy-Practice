package com.javathlon.lecture1;

public class TypeCasting {
    public static void main(String[] args) {
        long time = 4000000000L;
        int second = (int) (time / 1000000000L);

        System.out.println(second);
    }
}
