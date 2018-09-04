package com.leyao.chapter.chapter1_1;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_20 {
    public static double ln(int N) {
        if (N == 0) return 0;
        return Math.log(N) + ln(N - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int N = in.nextInt();
            System.out.println("N is " + N);
            System.out.println("ln(" + N + "!) is " + ln(N));
        }
    }
}
