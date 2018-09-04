package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-9-4
 */
public class Exercise_24 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addNode("a");
        list.addNode("b");
        list.addNode("c");
        list.addNode("d");
        list.addNode("e");
        list.removeAfter(list.search("c"));
        System.out.println(list);
    }
}
