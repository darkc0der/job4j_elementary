package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] data = new int[] {0, 5, 10};
        int rsl = Min.findMin(data);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLastMin() {
        int[] data = new int[] {10, 5, 3};
        int rsl = Min.findMin(data);
        int expected = 3;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMiddleMin() {
        int[] data = new int[] {10, 2, 5};
        int rsl = Min.findMin(data);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }
}