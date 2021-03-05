package ru.job4j.loop;
/* 5.2. Создать программу, вычисляющую факториал. [#393807] */
public class Factorial {
    public static int calc(int n) {
        int result  = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
