package com.javathlon.lecture1;

public class ByMyself {
    public static int countWord(String source, String searchWord) {
        source = source.toLowerCase();
        searchWord = searchWord.toLowerCase();

        int index = 0;
        int count = 0;

        while(index != -1) {
            index = source.indexOf(searchWord, index);
            if(index != -1) {
                count++;
            }
            if(index == -1) {
                break;
            }
            if(index < source.length() - 1) {
                index++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String sentence = "Now let's go to do something. Let me explain it first.";
        String word = "let";

        int toPrint = ByMyself.countWord(sentence, word);
        System.out.println(word + " occurred " + toPrint + " many times in " + sentence);
    }
}
