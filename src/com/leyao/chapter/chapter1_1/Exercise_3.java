package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-4
 */
public class Exercise_3 {
    public static void main(String[] args) {
        if (args.length != 0) {
            int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]), num3 = Integer.parseInt(args[2]);
            if (num1 == num2 && num2 == num3) {
                System.out.println("equal");
                return;
            }
            System.out.println("not equal");
            return;
        }
    }
}
