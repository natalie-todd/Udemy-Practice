package com.javathlon.lecture1;

public class ConstructorExample {
    public static void main(String[] args) {
        Human human = new Human(65, 180, "black");
        Human human2 = new  Human(70, 160, "white");

        System.out.println(human.weight);
        System.out.println(human2.skinColor);

        Human human3 = new Human();
    }
}
