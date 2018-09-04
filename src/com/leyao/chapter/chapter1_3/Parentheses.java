package com.leyao.chapter.chapter1_3;

import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class Parentheses {
    public static void main(String[] args) throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] cArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : cArr) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (c == ')') {
                if (stack.pop() != '(') {
                    throw new RuntimeException("配对失败");
                }
            }
            else if (c == ']') {
                if (stack.pop() != '[') {
                    throw new RuntimeException("配对失败");
                }
            }
            else if (c == '}') {
                if (stack.pop() != '{') {
                    throw new RuntimeException("配对失败");
                }
            }
        }
        System.out.println("配对成功");
    }
}
