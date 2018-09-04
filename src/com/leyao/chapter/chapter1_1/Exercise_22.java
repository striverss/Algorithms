package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_22 {
    public static int binarySearch(int key, int[] a, int lo, int hi, int deep) {
        System.out.println("lo is " + lo);
        System.out.println("hi is " + hi);
        deep++;
        System.out.println("deep is " + deep);
        if (lo > hi) return -1;
        int mid = (lo + hi) / 2;
        if (key == a[mid]) return mid;
        else if (key < a[mid]) return binarySearch(key, a, lo, mid - 1, deep);
        else return binarySearch(key, a, mid + 1, hi, deep);
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 5, 7, 9, 12, 14};
        int lo = 0;
        int hi = a.length - 1;
        int deep = 0;
        int key = 3;
        System.out.println("result index is " + binarySearch(key, a, lo, hi, deep));
    }
}
