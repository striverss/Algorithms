package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_26 {
    public static void sort(int a, int b, int c) {
        int t = 0;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println(a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        sort(3, 2, 1);
    }
}
