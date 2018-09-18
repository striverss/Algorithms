package com.leyao.utils.sort;

/**
 * 选择排序
 * @author leyao
 * @version 2018-8-30
 */
public class Selection {
    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
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
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, min, i);
        }
    }

    public static void main(String[] args) {
        Integer[] a = {4, 3, 2, 1};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
