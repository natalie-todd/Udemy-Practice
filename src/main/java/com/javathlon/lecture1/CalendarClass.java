package com.javathlon.lecture1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class CalendarClass {
    public static void main(String[] args) {
//static, not newing
        Calendar calendar = Calendar.getInstance();

        Date d = calendar.getTime();

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("We are on " + day + ". day of month.");

        int month = calendar.get(Calendar.MONTH);
        System.out.println("We are on " + (month + 1) + ". month of year.");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println(sdf.format(d));

        calendar.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Tomorrow:" + sdf.format(calendar.getTime()));

        calendar.set(Calendar.YEAR, 2017);
        System.out.println("Tomorrows date at 2017:" + sdf.format(calendar.getTime()));

        calendar.add(Calendar.WEEK_OF_YEAR, 25);
        System.out.println("25 weeks later:" + sdf.format(calendar.getTime()));

        calendar.add(Calendar.WEEK_OF_YEAR, -1);
        System.out.println("24 weeks later:" + sdf.format(calendar.getTime()));

        calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println(sdf.format(calendar.getTime()));

        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.MONTH, calendar.OCTOBER);
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println(sdf.format(calendar.DAY_OF_WEEK));
    }
}
