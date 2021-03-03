package ru.job4j.condition;
/* 4.3.6. Math.abs [#393700] */
public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }
}