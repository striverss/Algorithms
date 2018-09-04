package com.leyao.chapter.chapter1_1;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_23 {
    public static int binarySearch(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = (lo + hi) / 2;
        if (key == a[mid]) return mid;
        else if (key < a[mid]) return binarySearch(key, a, lo, mid - 1);
        else return binarySearch(key, a, mid + 1, hi);
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 5, 7, 9, 12, 14};
        int lo = 0;
        int hi = a.length - 1;
        System.out.println("params is + or - ?");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.nextLine();
        System.out.println("key arr is:");
        String keys = in.nextLine();
        String[] arr = keys.split(",");
        for (int i = 0; i < arr.length; i++) {
            int key = Integer.parseInt(arr[i]);
            if (s.equals("+") && binarySearch(key, a, lo, hi) == -1) {
                System.out.println("the key " + key + " is not in the whitelist");
            }
            else if (s.equals("-") && binarySearch(key, a, lo, hi) != -1) {
                System.out.println("the key " + key + " is in the whitelist");
            }
        }
    }
}
