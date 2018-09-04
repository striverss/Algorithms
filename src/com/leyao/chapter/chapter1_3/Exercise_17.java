package com.leyao.chapter.chapter1_3;

import com.leyao.chapter.chapter1_2.Transaction;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author leyao
 * @version 2018-8-20
 */
public class Exercise_17 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String transaction = sc.nextLine();
        System.out.println(Arrays.toString(readTransactions(transaction)));
    }

    public static Transaction[] readTransactions(String transaction) throws Exception {
        String[] transactionArr = transaction.split("-");
        Queue<Transaction> queue = new Queue<>();
        for (String s : transactionArr) {
            Transaction tran = new Transaction(s);
            queue.enqueue(tran);
        }
        int N = queue.size();
        Transaction[] result = new Transaction[N];
        for (int i = 0; i < N; i++) {
            result[i] = queue.dequeue();
        }
        return result;
    }
}
