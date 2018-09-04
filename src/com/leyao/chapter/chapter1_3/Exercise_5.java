package com.leyao.chapter.chapter1_3;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class Exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("下面会打印" + N + "的二进制表示：");
        Stack<Integer> stack = new Stack<>();
        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }
        for (int d : stack) {
            System.out.print(d);
        }
    }
}
