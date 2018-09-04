package com.leyao.chapter.chapter1_3;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class Exercise_9 {
    public static void main(String[] args) {
        String str = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        System.out.println(getCompleteExpression(str));
    }

    public static String getCompleteExpression(String str) {
        String[] strArr = str.split(" ");
        Stack<String> dataStack = new Stack<>();
        Stack<String> opeStack = new Stack<>();
        for (String s : strArr) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) opeStack.push(s);
            else if (s.equals(")")) {
                String afterData = dataStack.pop();
                String beforeData = dataStack.pop();
                dataStack.push("( " + beforeData + " " + opeStack.pop() + " " + afterData + " )");
            }
            else dataStack.push(s);
        }
        return dataStack.pop();
    }
}
