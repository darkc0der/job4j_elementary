package ru.job4j.array;

public class MatrixFind {
    public static void find(int[][] data, int el) {
        System.out.println("Find el: " + el);
        for (int row = 0; row < data.length; row++) {
            for (int cell = 0; cell < data[row].length; cell++) {
                int val  = data[row][cell];
                if (val == el) {
                    System.out.println("row: " + row + ", cell: " + cell);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] data = {{1, 2, 3}, {3, 2, 1}, {2, 3, 1}};
        MatrixFind.find(data, 3);
    }
}
