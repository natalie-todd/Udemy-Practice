package com.javathlon.lecture1;

public class MemoryTestPrimitiveArgument {
    public static void main(String[] args) {
    MemoryTestPrimitiveArgument test = new MemoryTestPrimitiveArgument();

    int testNumber = 49;

    test.doubleTheValue(testNumber);
        System.out.println(testNumber);
    }
    public int doubleTheValue(int val) {
        val *= 2;
        return val;

    }
}
