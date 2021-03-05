package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int resul = Factorial.calc(in);
        int expected = 120;
        assertThat(resul, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForEightThenSix() {
        int result = Factorial.calc(3);
        int expected = 6;
        assertThat(result, is(expected));
    }
}