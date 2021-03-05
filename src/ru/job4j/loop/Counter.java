package ru.job4j.loop;
/* 5.0.1. Сумма чисел. [#393803] */
public class Counter {

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for ( ; start <= finish; start++) {
            if (start % 2 == 0) {
                sum += start;
            }
        }
        return sum;
    }

    public static int sum(int start, int finish) {
        int sum = 0;
        for (; start <= finish; start++) {
            sum += start;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 2));
    }
}
