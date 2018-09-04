package com.leyao.chapter.chapter1_1;

import java.util.Arrays;

/**
 * @author leyao
 * @version 2018-7-4
 */
public class Exercise_15 {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 4};
        int M = 3;
        System.out.println(Arrays.toString(histogram(a, M)));
    }

    public static int[] histogram(int[] a, int M) {
        int[] arr = new int[M];
        for (int b : a) {
            if (b >= 0 && b < M)
                arr[b]++;
        }
        return arr;
    }
}
