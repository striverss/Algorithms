package com.leyao.chapter.chapter1_2;

public class Counter implements Comparable<Counter> {
    private final String name;
    private int count = 0;

    public Counter(String id) {
        name = id;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return count + " " + name;
    }

    @Override
    public int compareTo(Counter that) {
        if (this.count > that.count) return +1;
        else if (this.count < that.count) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        Counter[] hits = new Counter[n];
        for (int i = 0; i < n; i++) {
            hits[i] = new Counter("counter" + i);
        }

        for (int i = 0; i < trials; i++) {
            hits[(int) (Math.random() * n)].increment();
        }

        for (Counter hit : hits) {
            System.out.println(hit);
        }
    }
}
