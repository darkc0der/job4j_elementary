package ru.job4j.array;
/* 6.6.8. Двухмерный массив. Таблица умножения. [#393708] */

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] rsl = new int[size][size];
        for (int row = 0; row < rsl.length; row++) {
            for (int cell = 0; cell < rsl[row].length; cell++) {
                rsl[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return rsl;
    }
}
