package com.javathlon.lecture1;

import java.util.Date;

public class DateDemonstration {
    public static void main(String[] args) {
        Date d1 =  new Date();
        long l = d1.getTime();
        System.out.println(l);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date d2 = new Date();
        long l2 = d2.getTime();
        System.out.println(l2);

        long diff = l2 - 1;
        System.out.println(diff);

        System.out.println(diff/1000 + " seconds elapsed between d1 and d2");

        int comparisonResult = d2.compareTo(d1);
        System.out.println(comparisonResult);

        boolean ifD2isAfterD1 = d2.after(d1);
        System.out.println(ifD2isAfterD1);

        boolean ifD2isBeforeD1 = d2.before(d1);
        System.out.println(ifD2isBeforeD1);
    }
}
