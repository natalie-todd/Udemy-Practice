package com.javathlon.lecture1;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Human2 myHumanInstance = new Human2();
        myHumanInstance.weight = 80;
        myHumanInstance.height = 1.85;

        double result = myHumanInstance.calculateBodyMassIndex();

        System.out.println(result);

        String correction = myHumanInstance.findBodyType();

        System.out.println(correction);
    }
}
