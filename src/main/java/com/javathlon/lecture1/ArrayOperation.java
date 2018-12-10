package com.javathlon.lecture1;

public class ArrayOperation {

        public int sumItems(int[] source) {
            int sum = 0;
            System.out.println("int array is called");
            for(int i=0; i < source.length; i++) {
                sum += source[i];
            }
            return sum;
        }
        //overloaded version of function above because only difference is the argument type ( would also work if the
    //number of arguments were different)
    public int sumItems(double[] source) {
        int sum = 0;
        System.out.println("double array is called");
        for(int i=0; i < source.length; i++) {
            sum += source[i];
        }
        return sum;
    }
    }
