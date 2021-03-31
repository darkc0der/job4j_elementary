package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenEquals() {
        int money = 100;
        int price = 100;
        int[] rsl = Machine.change(money, price);
        int[] expected = {};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when50by35() {
        int money = 50;
        int price = 35;
        int[] rsl = Machine.change(money, price);
        int[] expected = {10, 5};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void when50by21() {
        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        Assert.assertArrayEquals(expected, result);
    }
}