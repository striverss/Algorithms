package com.leyao.chapter.chapter1_1;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-4
 */
public class Exercise_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int N = in.nextInt();
            String s = "";
            for (int i = N; i > 0; i /= 2)
                s = (i % 2) + s;
            System.out.println("N's binary string is " + s);
        }
    }
}
