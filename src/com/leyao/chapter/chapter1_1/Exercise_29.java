package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_29 {
    public static int rank(int key, int[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < key) {
                index++;
                continue;
            }
            break;
        }
        return index;
    }

    public static int count(int key, int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 4, 5, 5, 5, 7, 9};
        int key = 5;
        System.out.println(rank(key, a));
        System.out.println(count(key, a));
    }
}
