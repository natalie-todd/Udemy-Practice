package com.javathlon.lecture1;

public class TwoDimensionalArrayExercise {
    public static void main(String[] args) {
        String players[] = {"Ronaldo", "Messi", "Robben"};
        int goals[][] = {{2,1,2}, {0,1,0}, {1,0,0}, {1,3,1}};
        //Messi's goals overall
        int firstMatch[] = goals[0];
        //Messi 1st Match
        System.out.println("Messi 1st match:" + firstMatch[1]);
        System.out.println("Messi 1st match:" + goals[0][1]);
        //Messi 2nd match
        int secondMatch[] = goals[1];
        System.out.println("Messi second match:" + secondMatch[1]);
        System.out.println("Messi second match:" + goals[1][1]);

        System.out.println("Goals array has " + goals.length + " items");
        System.out.println("First item has " + goals[0].length + " items inside");

        System.out.println("Ronaldo 2nd week:" + goals[1][0]);
        System.out.println("Messi 2nd week:" + goals[1][1]);
        System.out.println("Robben 2nd week:" + goals[1][2]);

        int max = 0;
        int index = 0;
        for(int i=0; i<goals[i].length; i++) {
            if (max < goals[1][i]) {
                max = goals[1][i];
                index = i;
            }
        }
        System.out.println("Max goals in second week:" + max);
        System.out.println("Index of player that scored most goals in second week: " + index);
        System.out.println("Name of player that scored most goals in second week: " + players[index]);

        int ronaldo = goals[0][0] + goals[1][0] + goals[2][0] + goals[3][0];
        int messi = goals[0][1] + goals[1][1] + goals[2][1] + goals[3][1];
        int robben = goals[0][2] + goals[1][2] + goals[2][2] + goals[3][2];

        max = 0;
        index = 0;
        for(int i=0; i< goals[0].length; i++) {
            int count = 0;
            for (int j=0; j < goals.length; j++) {
                count += goals[j][i];
            }
            if(count > max) {
                max = count;
                index = i;
            }
            System.out.println("Player with index " + i + " scored " + count + " goals");
        }
        System.out.println("Highest scoring player overall has index: " + index + " with " + max + " goals");
        System.out.println("Highest scoring player overall name: " + players[index] + " with " + max + " goals");
    }
}
