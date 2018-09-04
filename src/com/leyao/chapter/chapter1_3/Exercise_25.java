package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-9-4
 */
public class Exercise_25 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addNode("a");
        list.addNode("b");
        list.addNode("c");
        list.addNode("d");
        list.addNode("e");
        System.out.println("两个结点都为null");
        list.insertAfter(null, null);
        System.out.println(list);
        System.out.println("其中一个结点为null");
        list.insertAfter(null, list.initNode("a"));
        System.out.println(list);
        list.insertAfter(list.initNode("a"), null);
        System.out.println(list);
        System.out.println("两个结点都不为null");
        list.insertAfter(list.search("c"), list.initNode("A"));
        System.out.println(list);
    }
}
