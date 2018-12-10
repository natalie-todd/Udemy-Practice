package com.javathlon.lecture1;

public class DivisibleByThree {
    public static void main(String[] args) {
        int count = 0;

        int index = 1;

        for(; index < 100; index++) {
            if(index % 3 == 0) {
                System.out.println(index);
                count ++;
            }
            if(count == 10) {
                break;
            }
        }
        System.out.println("Operation is done.");
    }
}
