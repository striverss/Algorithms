package com.leyao.chapter.chapter1_1;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_30 {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        int c = a % b;
        return gcd(b, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            boolean[][] b = new boolean[N][N];
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    if (i == j || i == 0 || j == 0) {
                        b[i][j] = false;
                    }
                    else {
                        int tmp = gcd(i, j);
                        if (tmp != 1) b[i][j] = false;
                        else b[i][j] = true;
                    }
                    System.out.println(i + " " + j + " " + b[i][j]);
                }
            }
        }


    }
}
