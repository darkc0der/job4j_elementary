package ru.job4j.array;
/* 6.7.1. Моно строка в матрице. [#393719] */

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
