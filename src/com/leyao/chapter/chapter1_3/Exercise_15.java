package com.leyao.chapter.chapter1_3;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class Exercise_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        Queue<String> queue = new Queue<>();
        for (String s : strArr) {
            queue.enqueue(s);
        }
        int k = sc.nextInt();
        int n = 0;
        for (String s : queue) {
            if (n == queue.size() - k) {
                System.out.println(s);
                break;
            }
            n++;
        }
    }
}
