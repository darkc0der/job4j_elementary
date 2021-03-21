package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l'};
        boolean rsl = ArrayChar.startWith(word, pref);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] perf = {'H', 'i'};
        boolean rsl = ArrayChar.startWith(word, perf);
        Assert.assertFalse(rsl);
    }
}