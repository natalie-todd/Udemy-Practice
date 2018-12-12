package com.javathlon.lecture1;

public class CountWords {

    public static int countWord(String source, String searchWord) {
        //Split the string by spaces
        String lower = searchWord.toLowerCase();
        String lowerSentence = source.toLowerCase();
        String a[] = lowerSentence.split(" ");

        //search for pattern in a
        int count = 0;
        for(int i = 0; i<a.length; i++) {
            if (lower.equals(a[i]))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {

        String source = "“Now let’s go to do something. Let me explain it first";
        String searchWord = "let";

        System.out.println(countWord(source, searchWord));
    }
}
