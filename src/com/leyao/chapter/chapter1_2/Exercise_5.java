package com.leyao.chapter.chapter1_2;

/**
 * @author leyao
 * @version 2018-7-9
 */
public class Exercise_5 {
    public static void main(String[] args) {
        //String是不可变对象，其方法都会创建一个新的对象，需要用新的String引用变量接受
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6, 11);
        System.out.println(s);
    }
}
