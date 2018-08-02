package com.leyao.test;

import com.leyao.util.Bag;
import com.leyao.util.Stack;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // Bag<String> bag = new Bag<>();
        // bag.add("yao");
        // bag.add("le");
        // bag.add("is");
        // bag.add("handsome");
        // Iterator<String> iterator = bag.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        Stack<String>[] arr = new Stack[1];
        arr[0] = new Stack<>();
        arr[0].push("le");
        arr[0].push("yao");
        Iterator<String> it = arr[0].iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
