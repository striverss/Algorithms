package com.leyao.chapter.chapter1_1;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-4
 */
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int N = in.nextInt();
            System.out.println("N is " + N);
            System.out.println("The answer is " + lg(N));
        }
    }

    public static int lg(int N) {
        int a = 0;
        int num = N / 2;
        while (num > 0) {
            a++;
            num /= 2;
        }
        return a;
    }
}
