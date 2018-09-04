package com.leyao.chapter.chapter1_3;

import java.util.Iterator;

/**
 * @author leyao
 * @version 2018-8-1
 */
public class Queue<T> implements Iterable<T> {
    private Node first;//用链表头代表队列头
    private Node last;//用链表尾代表队列尾
    private int N;

    private class Node {
        T t;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    /*
    入列操作就是给链表尾添加一个新结点
     */
    public void enqueue(T t) {
        Node oldLast = last;
        last = new Node();
        last.t = t;
        last.next = null;
        if (isEmpty())
            first = last;
        else
            oldLast.next = last;
        N++;
    }

    /*
    出列操作就是将链表头结点删除
     */
    public T dequeue() {
        if (isEmpty())
            return null;
        else {
            T t = first.t;
            first = first.next;
            if (isEmpty())
                last = null;
            N--;
            return t;
        }
    }

    /*
    重写符合栈规则的迭代器，结合链表
     */
    public Iterator<T> iterator() {
        return new ListIterator<>();
    }

    private class ListIterator<T> implements Iterator<T> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T t = (T) current.t;
            current = current.next;
            return t;
        }

        @Override
        public void remove() {

        }
    }
}
