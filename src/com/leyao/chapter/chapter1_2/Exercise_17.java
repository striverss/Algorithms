package com.leyao.chapter.chapter1_2;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-10
 */
public class Exercise_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个有理数的分子：");
        int a1 = sc.nextInt();
        System.out.println("请输入第一个有理数的分母：");
        int b1 = sc.nextInt();
        Rational rational1 = new Rational(a1, b1);
        System.out.println("请输入第二个有理数的分子：");
        int a2 = sc.nextInt();
        System.out.println("请输入第二个有理数的分母：");
        int b2 = sc.nextInt();
        Rational rational2 = new Rational(a2, b2);
        System.out.println("第一个有理数： " + rational1);
        System.out.println("第二个有理数： " +rational2);
        System.out.println("两个有理数是否相等： " + rational1.equals(rational2));
        System.out.println("两个有理数之和： " +rational1.plus(rational2));
        System.out.println("两个有理数之差： " +rational1.minus(rational2));
        System.out.println("两个有理数之积： " +rational1.times(rational2));
        System.out.println("两个有理数之商： " +rational1.divides(rational2));
    }
}
