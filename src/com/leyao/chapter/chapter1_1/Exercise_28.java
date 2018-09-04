package com.leyao.chapter.chapter1_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leyao
 * @version 2018-7-5
 */
public class Exercise_28 {
    public static int[] remove(int[] whiteList) {
        /*
        排序
         */
        Arrays.sort(whiteList);
        List<Integer> tmpList = new ArrayList<>();
        for (int i = 0, j = 0; i < whiteList.length; i++) {
            if (i != j && whiteList[i] == whiteList[j]) {
                j = i;
                continue;
            }
            j = i;
            tmpList.add(whiteList[i]);
        }
        int[] result = new int[tmpList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tmpList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] whiteList = {1, 3, 7, 3, 3, 5, 6, 4};
        System.out.println(Arrays.toString(remove(whiteList)));
    }
}
