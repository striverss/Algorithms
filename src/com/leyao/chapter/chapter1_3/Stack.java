package com.leyao.chapter.chapter1_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author leyao
 * @version 2018-8-1
 */
public class Stack<T> implements Iterable<T> {
    private Node first;//定义栈顶（最近添加的元素）
    private int N;//元素数量

    /*
    利用私有内部类定义链表抽象数据类型
     */
    private class Node {
        T t;
        Node next;
    }

    /*
    判断栈是否为空
     */
    public boolean isEmpty() {
        return first == null;
    }

    /*
    获得栈的元素数量
     */
    public int size() {
        return N;
    }

    /*
    向栈中压入元素
     */
    public void push(T t) {
        Node oldFirst = first;
        first = new Node();
        first.t = t;
        first.next = oldFirst;
        N++;
    }

    /*
    从栈中拿出元素
     */
    public T pop() {
        T t = first.t;
        first = first.next;
        N--;
        return t;
    }

    /*
    返回栈中最近添加的元素，不弹出该元素
     */
    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("stack do not have any element");
        return first.t;
    }

    /*
    重写符合栈规则的迭代器，结合链表
     */
    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>();
    }

    /*
    符合本数据类型的迭代器
     */
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
