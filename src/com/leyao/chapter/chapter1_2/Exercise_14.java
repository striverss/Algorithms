package com.leyao.chapter.chapter1_2;

import java.text.ParseException;

/**
 * @author leyao
 * @version 2018-7-10
 */
public class Exercise_14 {
    public static void main(String[] args) throws ParseException {
        Transaction transaction1 = new Transaction("yaole  1995-02-10  19.90");
        Transaction transaction2 = new Transaction("chenxing  1995-03-05  29.90");
        Transaction transaction3 = new Transaction("chenxing  1995-03-05  29.90");
        System.out.println(transaction1.equals(transaction2));
        System.out.println(transaction2.equals(transaction3));
    }
}
