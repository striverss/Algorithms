package com.leyao.utils;

/**
 * 基于二叉堆（堆）实现的优先队列数据结构
 * @author leyao
 * @version 2018-9-13
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;// 二叉堆实现优先队列
    private int N;// 定义队列的大小，实时队列元素的数量

    // 构造函数，构造一个固定大小的优先队列
    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN];
    }

    // 判定是否为空
    public boolean isEmpty() {
        return N == 0;
    }

    // 返回实时队列元素数量
    public int size() {
        return N;
    }

    // 插入函数
    public void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    // 删除并返回最大元素
    public Key delMax() {
        Key max = pq[1];
        exch(1, N--);
        pq[N + 1] = null;
        sink(1);
        return max;
    }

    // 比较函数
    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    // 交换函数
    private void exch(int i, int j) {
        Key tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;
    }

    // 上浮函数
    private void swim(int k) {
        while (k > 1) {
            if (less(k / 2, k)) exch(k / 2, k);
            k = k / 2;
        }
    }

    // 下沉函数
    private void sink(int k) {
        while (k * 2 <= N) {
            int j = k * 2;
            if (j < N && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }
}
