package com.javathlon.lecture1;

public class StringOperation {
    public String concatenateStrings(String[] sArray) {

        String result = "";

        for(int i=0; i < sArray.length; i++) {
        result += sArray[i];
        }
        return result;
    }
    public String concatenateStringsWithVarargs(String... sArray) {

        String result = "";

        for(int i=0; i < sArray.length; i++) {
            result += sArray[i];
        }
        return result;
    }
}
