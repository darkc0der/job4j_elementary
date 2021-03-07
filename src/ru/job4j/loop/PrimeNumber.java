package ru.job4j.loop;
/* 5.6. Простые числа [#393799] */

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
