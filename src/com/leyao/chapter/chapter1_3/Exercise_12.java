package com.leyao.chapter.chapter1_3;

import java.util.Iterator;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class Exercise_12 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("yao");
        stack.push("le");
        stack.push("is");
        stack.push("handsome");
        for (String s : copy(stack)) {
            System.out.println(s);
        }
    }

    /*
    copy方法
    接受一个Stack参数，返回该Stack的一个副本
     */
    public static Stack<String> copy(Stack<String> stack) {
        Stack<String> temp = new Stack<>();
        Stack<String> result = new Stack<>();
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            temp.push(it.next());
        }
        it = temp.iterator();
        while (it.hasNext()) {
            result.push(it.next());
        }
        return result;
    }
}
