package com.leyao.chapter.chapter2_2;

/**
 * @author leyao
 * @version 2018-9-5
 */
public class Exercise_5 {
    public static void main(String[] args) {
        System.out.println("自顶向下先拆分再归并，每一次扩张后面的子数组就得从最小的开始归并，再从大的归并。");
        System.out.println("自底向上直接从最小的子数组逐步归并，每次子数组的长度扩张为之前的二倍，但是需要考虑后面子数组长度小于前面子数组的情况。");
        System.out.println("过程略。");
    }
}
