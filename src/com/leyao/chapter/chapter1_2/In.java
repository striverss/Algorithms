package com.leyao.chapter.chapter1_2;

/**
 * @author leyao
 * @version 2018-7-10
 */
public class In {
    public static int[] readInts(String input) {
        String[] numArr = input.split("\\s+");
        int[] result = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            result[i] = Integer.parseInt(numArr[i]);
        }
        return result;
    }
}
