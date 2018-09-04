package com.leyao.chapter.chapter1_3;

/**
 * 后序表达式指的是运算符在变量之后
 * 计算机从左向右扫描
 * 遇到运算符则弹出栈中的两个元素
 * 遇到变量就将变量入栈
 *
 * @author leyao
 * @version 2018-8-20
 */
public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )";
        String[] strArr = str.split(" ");
        Stack<String> stack = new Stack<>();
        for (String s : strArr) {
            switch (s) {
                case "+":
                case "-":
                case "*":
                case "/":
                    stack.push(s);
                    break;
                case "(":
                    break;
                case ")":
                    System.out.print(stack.pop() + " ");
                    break;
                default:
                    System.out.print(s + " ");
                    break;
            }
        }
        System.out.println();
    }
}
