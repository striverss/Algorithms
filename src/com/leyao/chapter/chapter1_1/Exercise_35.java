package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-6
 */
public class Exercise_35 {
    private static boolean dice(int N) {
        int SIDES = 6;
        double[] dist1 = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist1[i + j] += 1.0;
            }
        }
        // System.out.println("standard view: ");
        for (int k = 2; k < dist1.length; k++) {
            dist1[k] /= 36.0;
            // System.out.printf("sum is " + k + ", p is " + "%.3f\n", dist1[k]);
        }

        double[] dist2 = new double[2 * SIDES + 1];
        for (int i = 0; i < N; i++) {
            int num1 = (int) (Math.random() * 6 + 1);
            int num2 = (int) (Math.random() * 6 + 1);
            dist2[num1 + num2] += 1.0;
        }
        // System.out.println("test view: ");
        for (int j = 2; j < dist2.length; j++) {
            dist2[j] /= N;
            // System.out.printf("sum is " + j + ", p is " + "%.3f\n", dist2[j]);
        }

        for (int k = 2; k < dist1.length; k++) {
            // System.out.println("dist1 " + dist1[k] + ", " + k);
            // System.out.println("dist2 " + dist2[k] + ", " + k);
            if (Math.abs(dist1[k] - dist2[k]) >= 0.001) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int result = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int N = 1;
            while (!dice(N)) {
                N++;
            }
            System.out.println("第" + i + "次： " + N);
            sum += N;
        }
        result = sum / 10;
        System.out.print("平均N为" + result + "时， 符合题意。");
    }
}
