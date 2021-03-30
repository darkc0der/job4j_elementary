package ru.job4j.array;
/* 6.7.1. Моно строка в матрице. [#393719] */
/* 6.7.2. Моно столбец в матрице. [#393720] */
/* 6.7.3. Массив из диагонали матрицы. [#393721] */

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

    public static boolean monoVertical(char[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];

        for (int i = 0; i < board.length; i++) {
            //if (!(monoVertical(board, i)) && !(monoHorizontal(board, i))) {
            rsl[i] = board[i][i];
            //}
        }
        return rsl;
    }
}
