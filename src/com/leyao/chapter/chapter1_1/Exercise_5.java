package com.leyao.chapter.chapter1_1;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-4
 */
public class Exercise_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
        }
    }
}
