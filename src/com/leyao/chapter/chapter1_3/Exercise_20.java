package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-9-4
 */
public class Exercise_20 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        for (int i = 0; i < 4; i++) {
            list.delete(3);
            System.out.println(list);
        }
    }
}
