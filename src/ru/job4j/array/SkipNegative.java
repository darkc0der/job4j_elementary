package ru.job4j.array;
/* 6.6.3. Двухмерный массив. If. [#393731] */

public class SkipNegative {
    public static int[][] skip(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < 0) {
                    data[i][j] = 0;
                }
            }
        }
        return data;
    }
}
