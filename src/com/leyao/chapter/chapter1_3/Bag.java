package com.leyao.chapter.chapter1_3;

import java.util.Iterator;

/**
 * @author leyao
 * @version 2018-8-1
 */
public class Bag<T> implements Iterable<T> {
    private Node first;
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

    public void add(T t) {
        Node oldFirst = first;
        first = new Node();
        first.t = t;
        first.next = oldFirst;
        N++;
    }

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
