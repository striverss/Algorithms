package com.leyao.chapter.chapter1_2;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-10
 */
public class Exercise_18 {
    public static void main(String[] args) {
        System.out.println("请输入需要计算的数：");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        Accumulator accumulator = new Accumulator();
        accumulator.addDataValue(x);
        System.out.println("m： " + accumulator.mean());
        System.out.println("方差： " + accumulator.var());
        System.out.println("标准差： " + accumulator.stddev());
    }
}
