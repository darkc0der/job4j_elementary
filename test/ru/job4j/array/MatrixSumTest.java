package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] data = {
                {10}
        };
        int rsl = MatrixSum.sum(data);
        int expected = 10;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenTwo() {
        int[][] data = {
                {1, 2},
                {1, 2}
        };
        int rsl = MatrixSum.sum(data);
        int expected = 6;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenThree() {
        int[][] data = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int rsl = MatrixSum.sum(data);
        int expected = 7;
        Assert.assertEquals(expected, rsl);
    }
}