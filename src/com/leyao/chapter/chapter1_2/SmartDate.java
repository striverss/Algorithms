package com.leyao.chapter.chapter1_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author leyao
 * @version 2018-7-9
 */
public class SmartDate {
    private final int year;
    private final int month;
    private final int day;

    public SmartDate(int year, int month, int day) {
        if (year < 0) throw new RuntimeException("年份输入不正确");
        if (month < 1 || month > 12) throw new RuntimeException("月份输入不正确");
        if (day < 1 || day > 31) throw new RuntimeException("日期输入不正确");
        this.year = year;
        this.month = month;
        this.day = day;
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

    public String dayOfTheWeek() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(year + "-" + month + "-" + day);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int week = c.get(Calendar.DAY_OF_WEEK);
        switch (week) {
            case 1 : return "Monday";
            case 2 : return "Tuesday";
            case 3 : return "Wednesday";
            case 4 : return "Thursday";
            case 5 : return "Friday";
            case 6 : return "Saturday";
            case 7 : return "Sunday";
            default: return null;
        }
    }
}
