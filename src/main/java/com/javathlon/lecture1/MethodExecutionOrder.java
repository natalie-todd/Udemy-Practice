package com.javathlon.lecture1;

public class MethodExecutionOrder {
    public static void main(String[] args) {
        //have to instantiate a class in order to use a method
        MethodExecutionOrder executionOrder = new MethodExecutionOrder();
        executionOrder.firstMethod();
        System.out.println("Program is finished!");
    }
    public void firstMethod() {
        int x = 5;
        secondMethod();
        System.out.println("First method:" + x);
    }
    public void secondMethod() {
        int x = 3;
        thirdMethod();
        System.out.println("Second method:" + x);
    }
    public void thirdMethod() {
        int x = 1;
        System.out.println("Third method:" + x);
    }
}
