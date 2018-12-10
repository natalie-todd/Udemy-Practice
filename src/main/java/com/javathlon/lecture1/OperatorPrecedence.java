package com.javathlon.lecture1;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int n1 = (3 * 5 ) % 7;
        int g1 = 2;
        System.out.println(n1);
        int n2 = 3 * 5 % 7;
        int g2 = 2;
        System.out.println(n2);
        int n3 = 3 + 5 % 7;
        int g3 = 3;
        System.out.println(n3);
        int n4 = ( 3 + 5 ) % 7;
        int g4 = 1;
        System.out.println(n4);
        int n5 = 6 * 5 + 11 % 20;
        int g5 = 30;
        System.out.println(n5);
        int n6 = ( 6 * ( 5 + 11 ) ) % 20;
        int g6 = 4;
        System.out.println(n6);
    }

}
