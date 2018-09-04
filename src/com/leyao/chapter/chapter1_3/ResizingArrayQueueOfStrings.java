package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class ResizingArrayQueueOfStrings {
    private String[] strArr = new String[1];
    private int N = 0;

    public boolean isEmpty() { return N == 0; }

    public int size() { return N; }

    public void resize(int max) {
        String[] temp = new String[max];
        for (int i = 0; i < N; i++) {
            temp[i] = strArr[i];
        }
        strArr = temp;
    }

    public void enqueue(String s) {
        if (N == strArr.length) resize(2 * strArr.length);
        strArr[N++] = s;
    }

    public String dequeue() {
        String s = strArr[0];
        /*
        删除第一个元素之后，将后面的元素依次向前移
         */
        for (int i = 0; i < N; i++) {
            strArr[i] = strArr[i + 1];
        }
        N--;
        if (N > 0 && N == strArr.length / 4) {
            resize(strArr.length / 2);
        }
        return s;
    }

}
