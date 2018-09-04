package com.leyao.chapter.chapter1_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author leyao
 * @version 2018-7-10
 */
public class Exercise_13 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Transaction transaction1 = new Transaction("yaole", sdf.parse("2/10/1995"), 39.99);
        Transaction transaction2 = new Transaction("chenxing  3/5/1995  49.99");
        System.out.println(transaction1);
        System.out.println(transaction2);
    }
}
