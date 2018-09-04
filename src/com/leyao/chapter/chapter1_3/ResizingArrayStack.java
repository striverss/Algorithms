package com.leyao.chapter.chapter1_3;

import java.util.Iterator;

/**
 * @author leyao
 * @version 2018-8-1
 */
public class ResizingArrayStack<T> implements Iterable<T> {
    private T[] a = (T[]) new Object[1];
    private int N = 0;

    /*
    判断栈是否为空
     */
    public boolean isEmpty() {return N == 0;}

    /*
    返回栈的实时元素数量
     */
    public int size() {return N;}

    /*
    动态扩展数组的私有方法
     */
    private void resize(int max) {
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    /*
    push操作
     */
    public void push(T t) {
        if (N == a.length) resize(a.length * 2);
        a[N++] = t;
    }

    /*
    pop操作
     */
    public T pop() {
        T t = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return t;
    }

    /*
    实现Iterable接口里的iterator方法，返回一个具体的迭代器对象
     */
    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator<T>();
    }

    /*
    利用私有内部类定义一个满足栈数据结构的迭代器，实现Iterator接口
     */
    private class ReverseArrayIterator<T> implements Iterator<T> {
        private int i = N;

        /*
        实现hasNext方法
         */
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        /*
        实现next方法
         */
        @Override
        public T next() {
            return (T) a[--i];
        }

        /*
        实现remove方法
         */
        @Override
        public void remove() {

        }
    }
}
