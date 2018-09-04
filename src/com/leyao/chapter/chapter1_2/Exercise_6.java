package com.leyao.chapter.chapter1_2;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-9
 */
public class Exercise_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first string?");
        String s1 = sc.next();
        System.out.println("second string?");
        String s2 = sc.next();
        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("s2 is s1's circular rotation");
        }
        else {
            System.out.println("s2 is not s1's circular rotation");
        }
    }
}
