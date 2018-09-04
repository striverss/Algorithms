package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-8-2
 */
public class Exercise_2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String str = "it was - the best - of times - - - it was - the - -";
        String[] sArr = str.split(" ");
        for (String s : sArr) {
            if (s.equals("-")) System.out.println(stack.pop());
            else stack.push(s);
        }
    }
}
