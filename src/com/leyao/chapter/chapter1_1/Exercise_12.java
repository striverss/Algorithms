package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-4
 */
public class Exercise_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.print(i);
    }
}
