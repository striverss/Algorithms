package com.leyao.chapter.chapter1_2;

/**
 * @author leyao
 * @version 2018-7-9
 */
public class Exercise_7 {
    /**
     * 用于反转字符串
     *
     * @param s
     * @return
     */
    private static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        s = mystery(s);
        System.out.println(s);
    }
}
