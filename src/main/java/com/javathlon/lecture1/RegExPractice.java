package com.javathlon.lecture1;

public class RegExPractice {
    public static void main(String[] args) {
        String wordSentence = "I've   met many who have earned          their PhD in Computer Science with gre";
        String[] words = wordSentence.split(" ");
        words = wordSentence.split("\\W+");

        for (String word: words) {
            System.out.println("word: " + word);
        }
    }

}
