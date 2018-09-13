package com.leyao.utils.sort;

/**
 * 自顶向下的归并排序
 * @author leyao
 * @version 2018-9-12
 */
public class Merge {
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

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[i], aux[j])) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }

    public static void sort(Comparable[] a, Comparable[] aux) {
        sort(a, aux, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = (lo + hi) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void main(String[] args) {
        Integer[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] aux = new Integer[a.length];
        sort(a, aux);
        assert isSorted(a);
        show(a);
    }
}
