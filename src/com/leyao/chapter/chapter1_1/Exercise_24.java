package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_24 {
    public static int gcd(int p, int q) {
        System.out.println("p: " + p);
        System.out.println("q: " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        if (args.length != 0) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(gcd(a, b));
        }
    }
}
