package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-6
 */
public class Exercise_36 {
    public static int[][] shuffleTest(int M, int N, int[] a) {
        int[][] result = new int[M][M];
        while (N > 0) {
            for (int i = 0; i < a.length; i++) {
                int num = i + (int) (Math.random() * (a.length - i));
                int tmp = a[i];
                a[i] = a[num];
                a[num] = tmp;
                result[i][num]++;
            }
            for (int j = 0; j < a.length; j++) {
                a[j] = j;
            }
            N--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        int M = 10;
        int N = 100;
        int[][] result = shuffleTest(M, N, a);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (j == M - 1) {
                    System.out.println("[" + i + "," + j + "]: " + result[i][j] + "    ");
                    continue;
                }
                System.out.print("[" + i + "," + j + "]: " + result[i][j] + "    ");
            }
        }
    }
}
