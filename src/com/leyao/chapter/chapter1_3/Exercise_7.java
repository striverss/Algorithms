package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class Exercise_7 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        for (int d : stack) System.out.print(d);
    }
}
