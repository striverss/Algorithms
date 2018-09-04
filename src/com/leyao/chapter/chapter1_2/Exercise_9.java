package com.leyao.chapter.chapter1_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-9
 */
public class Exercise_9 {
    private static int rank(int key, int[] a, Counter counter) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            counter.increment();
            int mid = (lo + hi) / 2;
            if (key == a[mid]) return mid;
            else if (key < a[mid]) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的大小： ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int num : a) {
            num = (int) (Math.random() * n);
        }
        Arrays.sort(a);
        System.out.println("请输入想要查找的数： ");
        int key = sc.nextInt();
        Counter counter = new Counter("keys");
        System.out.println(rank(key, a, counter));
        System.out.println(counter);
    }
}
