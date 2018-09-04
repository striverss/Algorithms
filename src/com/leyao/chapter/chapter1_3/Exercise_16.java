package com.leyao.chapter.chapter1_3;

import com.leyao.chapter.chapter1_2.Date;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class Exercise_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.nextLine();
        System.out.println(Arrays.toString(readDates(dateStr)));
    }

    public static Date[] readDates(String dateStr) {
        String[] dateArr = dateStr.split(" ");
        Queue<Date> queue = new Queue<>();
        for (String s : dateArr) {
            Date date = new Date(s);
            queue.enqueue(date);
        }
        int N = queue.size();
        Date[] result = new Date[N];
        for (int i = 0; i < N; i++) {
            result[i] = queue.dequeue();
        }
        return result;
    }
}
