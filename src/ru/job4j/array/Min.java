package ru.job4j.array;
/* 6.5.1. Поиск минимального числа в массиве. [#393717] */

public class Min {
    public static int findMin(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
}
