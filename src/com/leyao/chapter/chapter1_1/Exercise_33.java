package com.leyao.chapter.chapter1_1;

import java.util.Arrays;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_33 {
    public static void main(String[] args) {
        double[] d1 = new double[] {1, 3, 5};
        double[] d2 = new double[] {2, 4, 6};
        System.out.println("向量点乘： " + Matrix.dot(d1, d2));

        double[][] d3 = new double[][] {{1, 3, 5}, {2, 4, 6}};
        double[][] d4 = new double[][] {{1, 4}, {2, 5}, {3, 6}};
        double[][] result1 = Matrix.mult(d3, d4);
        System.out.println("矩阵和矩阵之积： ");
        matrixToString(result1);

        System.out.println("转置矩阵： ");
        double[][] result2 = Matrix.transpose(d3);
        matrixToString(result2);

        System.out.println("矩阵和向量之积： ");
        double[] result3 = Matrix.mult(d3, d1);
        System.out.println(Arrays.toString(result3));

        System.out.println("向量和矩阵之积： ");
        double[] result4 = Matrix.mult(d2, d4);
        System.out.println(Arrays.toString(result4));
    }

    public static void matrixToString(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (j == a[0].length - 1) {
                    System.out.println("[" + i + "," + j + "]: " + a[i][j]);
                    continue;
                }
                System.out.print("[" + i + "," + j + "]:" + a[i][j] + "    ");
            }
        }
    }
}
