package ru.job4j.array;
/* 6.5.2. Поиск минимума в диапазоне. [#393718] */

public class MinDiapason {
    public static int findMin(int[] data, int start, int finish) {
        int min = data[start];
        for (int i = start; i <= finish; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
}
