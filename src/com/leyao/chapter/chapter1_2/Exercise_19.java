package com.leyao.chapter.chapter1_2;

import java.text.ParseException;

/**
 * @author leyao
 * @version 2018-7-10
 */
public class Exercise_19 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date("2/10/1995");
        Transaction transaction = new Transaction("yaole  2/10/1995  3.99");
        System.out.println(date);
        System.out.println(transaction);
    }
}
