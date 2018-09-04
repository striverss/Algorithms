package com.leyao.chapter.chapter1_3;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class EvaluatePostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (String s : strArr) {
            if (s.equals("+")) {
                int afterNum = stack.pop();
                int beforeNum = stack.pop();
                stack.push(beforeNum + afterNum);
                continue;
            }
            else if (s.equals("-")) {
                int afterNum = stack.pop();
                int beforeNum = stack.pop();
                stack.push(beforeNum - afterNum);
                continue;
            }
            else if (s.equals("*")) {
                int afterNum = stack.pop();
                int beforeNum = stack.pop();
                stack.push(beforeNum * afterNum);
                continue;
            }
            else if (s.equals("/")) {
                int afterNum = stack.pop();
                int beforeNum = stack.pop();
                stack.push(beforeNum / afterNum);
                continue;
            }
            stack.push(Integer.parseInt(s));
        }
        System.out.println(stack.pop());
    }
}
