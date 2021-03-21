package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'П', 'р', 'и', 'в', 'е', 'т'};
        char[] post = {'в', 'е', 'т'};
        boolean rsl = EndsWith.endsWith(word, post);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'П', 'р', 'и', 'в', 'е', 'т'};
        char[] post = {'и', 'т'};
        boolean rsl = EndsWith.endsWith(word, post);
        Assert.assertFalse(rsl);
    }
}