package com.javathlon.lecture1;

public class MyFirstApp {
    public static void main(String[] args) {
        ArrayOperation operation = new ArrayOperation();

        int myArray[] = new int[] {1,2,3,4,1,2,3,4};

        int mySecondArray[] = new int[] {-1,-2,-3,-4,-1,-2,-3,-4};

        int result = operation.sumItems(myArray);
        int result2 = operation.sumItems(mySecondArray);

        System.out.println(result);
        System.out.println(result2);

        double myDoubleArray[] = new double[] {-1.0, -6.0};
        operation.sumItems(myDoubleArray);

        Human man = new Human();
        Human woman = new Human();

        man.setName("Talha");

        woman.setName("Jennifer");

        System.out.println("Male name: " + man.name);
        System.out.println("Female name: " + woman.name);

        woman.setName("Nicole");

        System.out.println("Male name: " + man.name);
        System.out.println("Female name: " + woman.name);
//
        woman.height = 160;
        woman.weight = 60;

        String s = woman.summarizeThePhysicalValues();
        System.out.println(s);

        man.height = 180;
        man.weight = 90;

        s = man.summarizeThePhysicalValues();
        System.out.println(s);

        StringOperation stringOperation = new StringOperation();

        String[] stringArrayToContactenate = new String[4];

        stringArrayToContactenate[0] = "Talha ";
        stringArrayToContactenate[1] = "Ocakhi ";
        stringArrayToContactenate[2] = "developer ";
        stringArrayToContactenate[3] = "trainer ";

        String concatenated = stringOperation.concatenateStrings(stringArrayToContactenate);

        System.out.println(stringOperation.concatenateStringsWithVarargs("a", "b", "c"));

        System.out.println(concatenated);

        double hours = 26.5 * 0.38;
        System.out.println(hours);

        double perDay = hours / 9;
        System.out.println(perDay);

        double inMin = perDay * 60;
        System.out.println(inMin);
    }
}
