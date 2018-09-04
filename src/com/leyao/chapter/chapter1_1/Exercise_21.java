package com.leyao.chapter.chapter1_1;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String name = in.next();
            double num1 = in.nextDouble();
            double num2 = in.nextDouble();
            double num3 = num1 / num2;
            System.out.printf(name + "    " + num1 + "    " + num2 + "    " + "%.3f\n", num3);
        }
    }
}
