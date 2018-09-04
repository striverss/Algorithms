package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-9-4
 */
public class LinkedList<T> {
    private Node<T> first;
    private int N;

    public LinkedList() {
        first = null;
        N = 0;
    }

    private class Node<T> {
        T item;
        Node<T> next;
    }

    /**
     * 添加头结点
     *
     * @param item
     */
    public void addFirstNode(T item) {
        Node<T> oldFirst = first;
        first = new Node<>();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    /**
     * 删除头结点
     */
    public void deleteFirstNode() {
        first = first.next;
        N--;
    }

    /**
     * 添加尾结点
     * @param item
     */
    public void addNode(T item) {
        Node<T> last = new Node<>();
        last.item = item;
        if (first == null) first = last;
        else {
            for (Node<T> node = first; node != null; node = node.next) {
                if (node.next == null) {
                    node.next = last;
                    break;
                }
            }
        }
        N++;
    }

    /**
     * 删除尾结点
     */
    public void deleteLastNode() {
        Node<T> current = first;
        if (first == null) return;
        if (first.next == null) {
            first = null;
            N--;
            return;
        }
        Node<T> next = current.next;
        while (next.next != null) {
            current = current.next;
            next = next.next;
        }
        current.next = current.next.next;
        N--;
    }

    /**
     * 删除指定位置结点
     * @param k
     */
    public void delete(int k) {
        Node<T> current = first;
        if (k <= 0 || current == null) return;
        if (k == 1) {
            first = first.next;
            N--;
            return;
        }
        k--;
        while (current != null && --k != 0) {
            current = current.next;
        }
        if (k != 0 || current == null || current.next == null) {
            return;
        }
        else {
            current.next = current.next.next;
            N--;
        }
    }

    /**
     * 查找是否包含值域是key的结点
     * @param key
     * @return boolean
     */
    public boolean find(T key) {
        for (Node<T> node = first; node != null; node = node.next) {
            if (key.equals(node.item)) return true;
        }
        return false;
    }

    /**
     * 查找特定的结点并返回
     * @param t
     * @return node
     */
    public Node<T> search(T t) {
        for (Node<T> node = first; node != null; node = node.next) {
            if (t.equals(node.item)) return node;
        }
        return null;
    }

    /**
     * 删除特定结点之后所有的结点
     * @param node
     */
    public void removeAfter(Node<T> node) {
        if (node == null || node.next == null) return;
        node.next = null;
    }

    public void insertAfter(Node<T> first, Node<T> second) {
        if (first == null || second == null) return;
        second.next = first.next;
        first.next = second;
    }

    // /**
    //  * 重载find方法，可以查找指定链表是否包含key
    //  * @param list
    //  * @param key
    //  * @return boolean
    //  */
    // public static boolean find(LinkedList<T> list, T key) {
    //     Node<T> first = list.first;
    //     for (Node<T> node = first; node != null; node = node.next) {
    //         if (key.equals(node.item)) return true;
    //     }
    //     return false;
    // }

    /**
     * 重写toString方法
     * @return LinkedList.toString
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node<T> node = first; node != null; node = node.next) {
            stringBuilder.append(node.item);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    /**
     * 返回链表的大小
     * @return size
     */
    public int size() {
        return N;
    }

    /**
     * 返回一个实例化的Node对象
     * @param item
     * @return node
     */
    public Node<T> initNode(T item) {
        Node<T> node = new Node<>();
        node.item = item;
        return node;
    }

}
