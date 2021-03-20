package ru.job4j.array;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class TurnTest {

    @Test
    public void whenElementsEven() {
        int[] data = new int[] {1, 2, 3, 4, 5};
        int[] rsl = Turn.back(data);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        Assert.assertThat(rsl, is(expected));
    }

    @Test
    public void whenElementsNotEven() {
        int[] data = new int[] {1, 2, 3, 4};
        int[] rsl = Turn.back(data);
        int[] expected = new int[] {4, 3, 2, 1};
        Assert.assertThat(rsl, is(expected));
    }
}