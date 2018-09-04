package com.leyao.chapter.chapter1_2;

/**
 * @author leyao
 * @version 2018-7-10
 */
public class Date {
    private final int year;
    private final int month;
    private final int day;

    public Date(String date) {
        String[] params = date.split("/");
        month = Integer.parseInt(params[0]);
        day = Integer.parseInt(params[1]);
        year = Integer.parseInt(params[2]);
    }

    public int year() {
        return year;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
