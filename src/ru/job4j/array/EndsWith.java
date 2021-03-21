package ru.job4j.array;
/* 6.4.2. Слово заканчивается на ... [#393714] */

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean rsl = true;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
