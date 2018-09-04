package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-4
 */
public class Exercise_7 {

    public static void main(String[] args) {
        questionA();
        questionB();
        questionC();
    }

    /**
     * question a
     */
    private static void questionA() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
        System.out.printf("a's anwser is %.5f\n", t);
    }

    /**
     * question b
     */
    private static void questionB() {
        int sumb = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sumb++;
        System.out.println("b's answer is " + sumb);
    }

    /**
     * question c
     */
    private static void questionC() {
        int sumc = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sumc++;
        System.out.println("c's answer is " + sumc);
    }

}
