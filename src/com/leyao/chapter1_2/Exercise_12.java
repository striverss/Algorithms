package com.leyao.chapter1_2;

import java.text.ParseException;
import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-9
 */
public class Exercise_12 {
   public static void main(String[] args) throws ParseException {
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入年份：");
       int year = sc.nextInt();
       System.out.println("请输入月份：");
       int month = sc.nextInt();
       System.out.println("请输入日期：");
       int day = sc.nextInt();
       SmartDate smartDate = new SmartDate(year, month, day);
       System.out.println(smartDate);
       System.out.println(smartDate.dayOfTheWeek());
   }
}
