package com.javathlon.lecture1;

public class Human2 {
    double height;
    double weight;

    public double calculateBodyMassIndex() {
        double bmi = weight / (height * height);
        return bmi;
    }
   public String findBodyType(){
        double index = weight / (height * height);
        String result = null;
        if(index < 18.5) {
            result = "Thinness";
        }
        if(index < 25.5) {
            result = "Normal";
        }
        return result;
    }
}
