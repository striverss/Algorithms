package com.leyao.chapter.chapter1_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_39 {
    public static void main(String[] args) {
        System.out.println("请输入想要程序运行的次数： ");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int T = sc.nextInt();
            int[] result = new int[4];
            for (int i = 0; i < T; i++) {
                int N = 100;
                for (int j = 0; j < 4; j++) {
                    N *= 10;
                    int[] arr1 = new int[N];
                    int[] arr2 = new int[N];
                    for (int k = 0; k < N; k++) {
                        arr1[k] = 100000 + (int) (Math.random() * (1000000 - 100000 + 1));
                        arr2[k] = 100000 + (int) (Math.random() * (1000000 - 100000 + 1));
                    }
                    Arrays.sort(arr1);
                    for (int m = 0; m < arr2.length; m++) {
                        if (Exercise_38.binarySearch(arr2[m], arr1) != -1) {
                            result[j]++;
                        }
                    }
                }
            }
            System.out.println("对于每个N，" + T + "次实验中该数量的平均值如下： ");

            for (int n = 0; n < 4; n++) {
                double d = result[n] / T;
                System.out.printf("%.3f    ", d);
            }
        }
    }
}
