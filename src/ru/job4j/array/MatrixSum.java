package ru.job4j.array;
/* 6.6.2. Двухмерный массив. Циклы. [#393730] */

public class MatrixSum {
    public static int sum(int[][] data) {
        int rsl = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rsl += data[i][j];
            }
        }
        return rsl;
    }
}
