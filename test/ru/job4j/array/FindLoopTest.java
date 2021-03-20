package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas8Then2() {
        int[] data = new int[] {5, 2, 8, 9};
        int el = 8;

        int rsl = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }
    
    @Test
    public void whenArrayHasNotThreeThenZeroOne() {
        int[] data = new int[] {5, 2, 8, 9};
        int el = 3;
        int rsl = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, rsl);
    }
}