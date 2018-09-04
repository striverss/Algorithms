package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-4
 */
public class Exercise_19 {
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            // System.out.println(N + " " + F1(N));
            // System.out.println(N + " " + F2(N));
            System.out.println(N + " " + F3(N));
        }
    }

    /**
     * 斐波那契数列
     * 递归法实现
     *
     * @param N
     * @return long
     */
    public static long F1(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F1(N - 1) + F1(N - 2);
    }

    /**
     * 斐波那契数列
     * 数组法实现
     *
     * @param N
     * @return long
     */
    public static long F2(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        long[] arr = new long[N + 1];
        arr[0] = 0L;
        arr[1] = 1L;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[N];
    }

    /**
     * 斐波那契数列
     * 变量法实现
     *
     * @param N
     * @return
     */
    public static long F3(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        long a = 0L, b = 1L, c = 0L;
        for (int i = 2; i <= N; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
