package ru.job4j.array;
/* 6.4. Слово начинается с ... [#393710] */

public class ArrayChar {
    public static boolean startWith(char[] word, char[] pref) {
        boolean rsl = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
