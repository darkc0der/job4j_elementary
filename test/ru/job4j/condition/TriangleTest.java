package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ac = 5, bc = 10, ab = 8;
        boolean expected = true;
        boolean out = Triangle.exist(ac, bc, ab);
        assertThat(expected, is(out));
    }

    @Test
    public void whenNotExist() {
        double ac = 2, bc = 10, ab = 13;
        boolean expected = false;
        boolean out = Triangle.exist(ac, bc, ab);
        assertThat(expected, is(out));
    }
}