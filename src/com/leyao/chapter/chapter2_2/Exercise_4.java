// package com.leyao.chapter.chapter2_2;
//
// import com.leyao.utils.sort.Merge;
//
// import java.util.Arrays;
//
// /**
//  * @author leyao
//  * @version 2018-9-5
//  */
// public class Exercise_4 {
//     public static void main(String[] args) {
//         Integer[] a1 = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
//         Integer[] a2 = {5, 4, 3, 2, 1, 10, 9, 8, 7, 6};
//         Integer[] aux1 = new Integer[a1.length];
//         Integer[] aux2 = new Integer[a2.length];
//         System.out.println("原数组1：");
//         System.out.println(Arrays.toString(a1));
//         Merge.merge(a1, aux1, 0, 4, 9);
//         System.out.println("调用merge()方法后：");
//         System.out.println(Arrays.toString(a1));
//         System.out.println("原数组2：");
//         System.out.println(Arrays.toString(a2));
//         Merge.merge(a2, aux2, 0, 4, 9);
//         System.out.println("调用merge()方法后：");
//         System.out.println(Arrays.toString(a2));
//         System.out.println("可以得出结论：当且仅当两个输入的子数组都有序时原地归并的抽象方法才能得到正确的结果。");
//     }
// }
