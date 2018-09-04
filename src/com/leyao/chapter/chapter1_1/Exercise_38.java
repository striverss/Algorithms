package com.leyao.chapter.chapter1_1;

import java.io.*;
import java.util.*;

/**
 * @author leyao
 * @version 2018-7-6
 */
public class Exercise_38 {
    public static void main(String[] args) throws IOException {
        File file = new File("");
        String projectPath = file.getCanonicalPath();
        String largeWPath = projectPath + "/data/largeW.txt";
        String largeTPath = projectPath + "/data/largeT.txt";
        File largeW = new File(largeWPath);
        File largeT = new File(largeTPath);
        BufferedReader largeWReader = new BufferedReader(new InputStreamReader(new FileInputStream(largeW)));
        BufferedReader largeTReader = new BufferedReader(new InputStreamReader(new FileInputStream(largeT)));
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        String str1 = null;
        while ((str1 = largeWReader.readLine()) != null) {
            str1 = str1.trim();
            list1.add(Integer.parseInt(str1));
        }
        int[] largeWArr = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            largeWArr[i] = list1.get(i);
        }
        String str2 = null;
        while ((str2 = largeTReader.readLine()) != null) {
            str2 = str2.trim();
            list2.add(Integer.parseInt  (str2));
        }
        int[] largeTArr = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            largeTArr[i] = list2.get(i);
        }
        System.out.println("请输入需要查找的数： ");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int key = sc.nextInt();
            Arrays.sort(largeWArr);
            Arrays.sort(largeTArr);
            long startTime1 = System.currentTimeMillis();
            System.out.println(binarySearch(key, largeWArr));
            System.out.println(binarySearch(key, largeTArr));
            long endTime1 = System.currentTimeMillis();
            System.out.println("二分查找需要时间： " + (endTime1 - startTime1));
            long startTime2 = System.currentTimeMillis();
            System.out.println(violentSearch(key, largeWArr));
            System.out.println(binarySearch(key, largeTArr));
            long endTime2 = System.currentTimeMillis();
            System.out.println("暴力查找需要时间： " + (endTime2 - startTime2));
        }
    }

    public static int binarySearch(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int violentSearch(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                return i;
            }
        }
        return -1;
    }

}
