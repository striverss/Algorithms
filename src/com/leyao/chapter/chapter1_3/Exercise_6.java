package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class Exercise_6 {
    public static void main(String[] args) {
        System.out.println("下面会将0123456789倒序排列：");
        Queue<Integer> q = new Queue<>();
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty())
            stack.push(q.dequeue());
        while (!stack.isEmpty())
            q.enqueue(stack.pop());
        while (!q.isEmpty())
            System.out.print(q.dequeue());
    }
}
