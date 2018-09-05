package com.leyao.utils.sort;

import java.util.Arrays;

/**
 * 自底向上的归并排序
 * @author leyao
 * @version 2018-9-5
 */
public class MergeBU {
    // 归并所需的辅助数组
    private static Comparable[] aux;

    // 算法
    public static void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        // 确定每一次递归的子数组大小
        for (int sc = 1; sc < N; sc = sc + sc)
            // 每一次递归都将整个数组拆分成若干个子数组，分别归并
            for (int lo = 0; lo < N - sc; lo = lo + sc + sc) {
                merge(a, lo, lo + sc - 1, Math.min(lo + sc + sc - 1, N - 1));
                // System.out.println(Arrays.toString(a));
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

    public static void main(String[] args) {
        String[] a = {"M", "E", "R", "G", "E", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        // Integer[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
