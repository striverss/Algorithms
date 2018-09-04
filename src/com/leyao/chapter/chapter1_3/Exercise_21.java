package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-9-4
 */
public class Exercise_21 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addNode("yao");
        list.addNode("le");
        list.addNode("is");
        list.addNode("handsome");
        System.out.println(list.find("s"));
        System.out.println(list.find("le"));
    }
}
