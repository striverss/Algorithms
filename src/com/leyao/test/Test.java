package com.leyao.test;

import com.leyao.chapter1_3.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        for (int d : queue) System.out.println(d);
    }
}
