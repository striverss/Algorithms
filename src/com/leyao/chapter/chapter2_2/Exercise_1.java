package com.leyao.chapter.chapter2_2;

/**
 * @author leyao
 * @version 2018-9-5
 */
public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("a[]:");
        System.out.println("A E Q S U Y | E I N O S T");
        System.out.println("aux[]:");
        System.out.println("A E Q S U Y | E I N O S T");
        System.out.println("开始归并：");
        System.out.println("a[]:");
        System.out.println("A");
        System.out.println("A E");
        System.out.println("A E E");
        System.out.println("A E E I");
        System.out.println("A E E I N");
        System.out.println("A E E I N O");
        System.out.println("A E E I N O Q");
        System.out.println("A E E I N O Q S");
        System.out.println("A E E I N O Q S S");
        System.out.println("A E E I N O Q S S T");
        System.out.println("A E E I N O Q S S T U");
        System.out.println("A E E I N O Q S S T U Y");
        System.out.println("aux[]:");
        System.out.println("A E Q S U Y | E I N O S T");
        System.out.println("  E Q S U Y | E I N O S T");
        System.out.println("    Q S U Y | E I N O S T");
        System.out.println("    Q S U Y |   I N O S T");
        System.out.println("    Q S U Y |     N O S T");
        System.out.println("    Q S U Y |       O S T");
        System.out.println("    Q S U Y |         S T");
        System.out.println("      S U Y |         S T");
        System.out.println("        U Y |         S T");
        System.out.println("        U Y |           T");
        System.out.println("        U Y |            ");
        System.out.println("          Y |            ");
    }
}
