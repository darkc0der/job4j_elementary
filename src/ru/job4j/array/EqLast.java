package ru.job4j.array;
/* 6.4.1. Сравнить последние элементы двух массивов [#393729] */

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            return left[left.length - 1] == right[right.length - 1];
        }
        return false;
    }
}
