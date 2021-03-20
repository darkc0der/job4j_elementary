package ru.job4j.array;
/* 6.1. Классический поиск перебором. [#393707] */
public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int rsl = -1; /* Если элемента нет в массиве то возвращаем -1 */
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
