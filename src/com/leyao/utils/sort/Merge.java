package com.leyao.utils.sort;

import java.util.Arrays;

/**
 * 自顶向下的归并排序
 * @author leyao
 * @version 2018-9-4
 */
public class Merge {
    private static Comparable[] aux;

    /**
     * 初始化，直接调用完整的sort方法
     * @param a
     */
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, Comparable[] aux) {
        sort(a, aux, 0, a.length - 1);
    }

    /**
     * 自顶向下的归并排序
     *
     * @param a
     * @param lo
     * @param hi
     */
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        // 迭代的边界条件，当hi小于等于lo时返回
        if (hi <= lo) return;
        int mid = (lo + hi) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        // 练习2.2.8，当a[mid]<=a[mid+1]时，就不调用merge()
        if (SortUtil.less(a[mid + 1], a[mid])) {
            merge(a, aux, lo, mid, hi);
        }
    }

    /**
     * 原地归并的抽象方法
     * @param a
     * @param lo
     * @param mid
     * @param hi
     */
    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        // 首先将数组a的元素全部复制到aux数组中
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        // 开始归并
        for (int k = lo; k <= hi; k++) {
            // 如果左半边的数已经填充完毕，则使用右边的数
            if (i > mid) a[k] = aux[j++];
            // 如果右半边的数已经填充完毕，则使用左边的数
            else if (j > hi) a[k] = aux[i++];
            // 如果左边的数小于右边的数，那么使用左边的数
            else if (SortUtil.less(aux[i], aux[j])) a[k] = aux[i++];
            // 如果右边的数小于左边的数，那么使用右边的数
            else a[k] = aux[j++];
        }
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        // 首先将数组a的元素全部复制到aux数组中
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        // 开始归并
        for (int k = lo; k <= hi; k++) {
            // 如果左半边的数已经填充完毕，则使用右边的数
            if (i > mid) a[k] = aux[j++];
                // 如果右半边的数已经填充完毕，则使用左边的数
            else if (j > hi) a[k] = aux[i++];
                // 如果左边的数小于右边的数，那么使用左边的数
            else if (SortUtil.less(aux[i], aux[j])) a[k] = aux[i++];
                // 如果右边的数小于左边的数，那么使用右边的数
            else a[k] = aux[j++];
        }
    }

    public static void fastMerge(Comparable[]a, Comparable[] aux, int lo, int mid, int hi) {
        // 将a[]的前半部分数组复制到aux[]中
        for (int i = lo; i <= mid; i++) {
            aux[i] = a[i];
        }
        // 将a[]的后半部分按照降序复制到aux[]中
        for (int i = mid + 1; i <= hi; i++) {
            aux[i] = a[mid + hi + 1 - i];
        }

        int i = lo;
        int j = hi;
        for (int k = lo; k <= hi; k++) {
            if (SortUtil.less(aux[i], aux[j])) {
                a[k] = aux[i++];
            }
            else a[k] = aux[j--];
        }
    }

    public static void main(String[] args) {
        String[] a = {"E", "E", "G", "M", "R", "A", "C", "E", "R", "T"};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
