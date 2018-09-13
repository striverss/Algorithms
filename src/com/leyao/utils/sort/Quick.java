package com.leyao.utils.sort;

/**
 * 快速排序
 * @author leyao
 * @version 2018-9-12
 */
public class Quick {
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

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;// 确定左指针
        int j = hi + 1;// 确定右指针
        Comparable v = a[lo];// 确定切点
        while (true) {
            // 确保v左边的元素小于v
            while (less(a[++i], v)) {
                if (i == hi) break;
            }
            // 确保v右边的元素大于v
            while (less(v, a[--j])) {
                if (j == lo) break;
            }
            // 当指针相遇时跳出循环
            if (i >= j) break;
            // 指针未相遇时需要交换元素
            exch(a, i, j);
        }
        // 交换切点和j元素位置
        exch(a, lo, j);
        // 返回切点准确位置，保证左边元素小于它，右边元素大于它
        return j;
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        Integer[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
