package ru.job4j.array;
/* 6.0.4. Заполнить массив степенями чисел. [#393706] */

import static java.lang.Math.*;

public class Square {

    public static int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int i = 0; i < bound; i++) {
            rsl[i] = i * i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[]rsl = calculate(5);
        for (int i : rsl) {
            System.out.println("Bound: " + i);
        }
    }
}
