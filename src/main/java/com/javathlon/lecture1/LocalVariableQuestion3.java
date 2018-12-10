package com.javathlon.lecture1;

public class LocalVariableQuestion3 {

    public void doSomething() {
        int myVariable = 10;
        doSomething();
        System.out.println(myVariable);
    }

    public static void main(String[] args) {
        LocalVariableQuestion3 question3 = new LocalVariableQuestion3();
        question3.doSomething();
    }
}
