package com.javathlon.lecture1;

public class LocalVariableQuestion2 {
    public void doSomething() {
        int myVariable = 10;
        doSomethingMore();
        System.out.println(myVariable);
    }
    public void doSomethingMore() {
        int myVaribale = 10;
        myVaribale += 2;
        System.out.println(myVaribale);
    }

    public static void main(String[] args) {
        LocalVariableQuestion2 question = new LocalVariableQuestion2();
        question.doSomething();
    }
}
