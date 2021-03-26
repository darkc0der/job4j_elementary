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

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int start = 2;
        int finish = 4;
        int el = 2;
        int rsl = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenNotFind() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int start = 2;
        int finish = 4;
        int el = 3;
        int rsl = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, rsl);
    }
}