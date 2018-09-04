package com.leyao.chapter.chapter1_1;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_27 {
    private static long count = 0L;
    private static long betterCount1 = 0L;
    private static double[][] d;

    /**
     * 求二项分布
     * 原始递归法
     *
     * @param N
     * @param k
     * @param p
     * @return
     */
    public static double binomial(int N, int k, double p) {
        count++;
        if (N == 0 && k == 0) return 1.0;
        if (N < 0|| k < 0) return 0.0;
        return (1 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    /**
     * 求二项分布
     * 优化递归法，将计算好的保存至数组中，无需再计算
     *
     * @param N
     * @param k
     * @param p
     * @return
     */
    public static double betterBinomial1(int N, int k, double p) {
        d = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++)
            for (int j = 0; j <= k; j++)
                d[i][j] = -1;
        return betterBinomial1Sub(N, k, p);
    }

    /**
     * 优化递归法子方法
     *
     * @param N
     * @param k
     * @param p
     * @return
     */
    public static double betterBinomial1Sub(int N, int k, double p) {
        betterCount1++;
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        if (d[N][k] == -1) {
            d[N][k] = (1 - p) * betterBinomial1Sub(N - 1, k, p) + p * betterBinomial1Sub(N - 1, k - 1, p);
        }
        return d[N][k];
    }

    /**
     * 求二项分布
     * 非递归法
     *
     * @param N
     * @param k
     * @param p
     * @return
     */
    public static double betterBinomial2(int N,int k,double p) {
        double a = 1;
        double b = 1;

        double c = betterBinomial2Sub(N,k);

        while((N - k) > 0){  //计算(1-p)的(N-k)次方
            a = a * (1 - p);
            N--;
        }

        while(k > 0){  //计算p的k次方
            b = b * p;
            k--;
        }

        return c * a * b;
    }

    /**
     * 非递归法子方法
     *
     * @param N
     * @param k
     * @return
     */
    public static double betterBinomial2Sub(int N, int k) {
        double min = k;
        double max = N-k;
        double t = 0;

        double NN = 1;
        double kk = 1;

        if(min > max){
            t = min;
            min = max;
            max = t;
        }

        while(N > max){//分母中较大的那部分阶乘约分不用计算
            NN = NN * N;
            N--;
        }

        while(min > 0){//计算较小那部分的阶乘
            kk = kk * min;
            min--;
        }

        return NN / kk;
    }

    public static void main(String[] args) {
        System.out.println(binomial(30, 10, 0.25) + "    " + count);
        System.out.println(betterBinomial1(30, 10, 0.25) + "    " + betterCount1);
        System.out.println(betterBinomial2(30, 10, 0.25));
    }
}
