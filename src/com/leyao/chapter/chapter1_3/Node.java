package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-9-3
 */
public class Node<T> {
    T t;
    Node<T> next;

    /*
    删除链表的最后一个结点
    遍历一遍链表，如果某个节点的next为null，则删除它的父节点
     */
    public void deleteLastNode() {
        Node<T> current = this;

        if (current == null) return;

        Node<T> next = current.next;
        if (next == null) current = null;

        while (next.next != null) {
            current = next;
            next = next.next;
        }

        current.next = null;
    }
}
