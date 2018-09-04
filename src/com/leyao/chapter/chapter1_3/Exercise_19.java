package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-9-3
 */
public class Exercise_19 {
    public static void main(String[] args) {
        Node<Integer> first = new Node<>();
        Node<Integer> second = new Node<>();
        Node<Integer> third = new Node<>();

        first.t = 1;
        second.t = 2;
        third.t = 3;

        first.next = second;
        second.next = third;

        first.deleteLastNode();

        for (Node<Integer> node = first; node != null; node = node.next) {
            System.out.println(node.t);
        }
    }
}
