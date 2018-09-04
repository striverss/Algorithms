package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-4
 */
public class Exercise_11 {
    public static void main(String[] args) {
        boolean[][] b = new boolean[][] {{true, false, true}, {true, true, false}, {false, false, true}};
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[0].length; j++) {
                if (j == b[0].length - 1) {
                    System.out.println("[" + i + "," + j + "]: " + b[i][j]);
                    continue;
                }
                System.out.print("[" + i + "," + j + "]: " + b[i][j] + "   ");
            }
    }
}
