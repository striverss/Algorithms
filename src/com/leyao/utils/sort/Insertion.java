package com.leyao.utils.sort;

/**
 * 插入排序
 * @author leyao
 * @version 2018-9-11
 */
public class Insertion {
    private static boolean less(Comparable a, Comparable b) {
        if (a.compareTo(b) < 0) return true;
        return false;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void show(Comparable[] a) {
        for (Comparable c : a) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = {5, 3, 1};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
