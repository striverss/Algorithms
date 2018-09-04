package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-4
 */
public class Exercise_13 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 4, 7}, {2, 5, 8}};
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (i == matrix.length - 1) {
                    System.out.println(matrix[i][j]);
                    continue;
                }
                System.out.print(matrix[i][j] + "\t");
            }
        }
    }
}
