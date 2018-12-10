package com.javathlon.lecture1;

public class LocalVariableQuestion {

    public void doSomething() {
        int myVariable  = 10;
        myVariable += 1;
        System.out.println(myVariable);
    }
    public void soSomethingMore() {
        int myVariable = 10;
        myVariable +=2;
        System.out.println(myVariable);
    }
    public static void main(String[] args) {
        LocalVariableQuestion question =  new LocalVariableQuestion();
        question.doSomething();
        question.soSomethingMore();
    }
}
