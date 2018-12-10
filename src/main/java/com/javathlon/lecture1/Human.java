package com.javathlon.lecture1;

public class Human {
    int weight;
    int height;
    String skinColor;
    String name;
    static int count = 0;

    static void incrementCountByOne() {
        //can only access static variables, not instance ones like weight because the statics are loaded to the JVMs
        //first
        count++;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String summarizeThePhysicalValues() {
        String summary = "Weight: " + weight + " kgs " + "height: " + height + " cm.";
        return summary;
    }
    public Human() {
//You can use a static method inside of an instance constructor
        Human.incrementCountByOne();
    }
//Constructor overloading
    public Human(int weight, int height, String skinColor) {
        this.weight = weight;
        this.height = height;
        this.skinColor = skinColor;
    }

}
