package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Matrix {
    public static double dot(double[] x, double[] y) {
        if (x.length == y.length) {
            double sum = 0.0;
            for (int i = 0; i < x.length; i++) {
                sum = sum + x[i] * y[i];
            }
            return sum;
        }
        else {
            System.out.println("error matrix!");
            return 0.0;
        }
    }

    public static double[][] mult(double[][] a, double[][] b) {
        if (a[0].length == b.length) {
            double[][] d = new double[a.length][b[0].length];
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[0].length; j++) {
                    double sum = 0.0;
                    for (int m = 0; m < b.length; m++) {
                        sum = sum + a[i][m] * b[m][j];
                    }
                    d[i][j] = sum;
                }
            }
            return d;
        }
        else {
            System.out.println("error matrix!");
            return null;
        }
    }

    public static double[][] transpose(double[][] a) {
        double[][] d = new double[a[0].length][a.length];
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                d[j][i] = a[i][j];
            }
        }
        return d;
    }

    public static double[] mult(double[][] a, double[] x) {
        if (a[0].length == x.length) {
            double[] d = new double[a.length];
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    d[i] = d[i] + a[i][j] * x[j];
                }
            }
            return d;
        }
        else {
            System.out.println("error matrix!");
            return null;
        }
    }

    public static double[] mult(double[] y, double[][] a) {
        if (y.length == a.length) {
            double[] d = new double[a[0].length];
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < y.length; j++) {
                    d[i] = d[i] + y[j] * a[j][i];
                }
            }
            return d;
        }
        else {
            System.out.println("error matrix!");
            return null;
        }
    }
}
