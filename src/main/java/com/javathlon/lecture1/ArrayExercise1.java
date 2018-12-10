package com.javathlon.lecture1;

public class ArrayExercise1 {
    public static void main(String[] args) {
        int countArray[] = {8, 3, 4, 1, 9, 5, 2};

        System.out.println(countArray.length);

        for(int i=0; i<countArray.length; i++) {
            System.out.println((i+1) + ". Element is: " + countArray[i]);
        }
        int sum = 0;

        for(int i=0; i < countArray.length; i++) {
            if(countArray[i] % 2 ==0) {
                sum += countArray[i];
            }
        }
        System.out.println("sum: " + sum);
        sum = 0;
        //enhanced for loop
        for(int val : countArray) {
            if(val % 2 == 0) {
                sum += val;
            }
        }
    }
}
