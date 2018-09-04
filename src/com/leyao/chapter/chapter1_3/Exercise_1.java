package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-8-2
 */
public class Exercise_1 {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(3);
        System.out.println("栈为空？ " + stack.isEmpty());
        stack.push("yao");
        stack.push("le");
        stack.push("handsome");
        System.out.println("栈里元素的数量： " + stack.size());
        System.out.println("栈已满？ " + stack.isFull());
    }
}
