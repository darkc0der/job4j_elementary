package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1Year() {
        int year = Mortgage.year(1000, 1200, 0.10);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        int year = Mortgage.year(100, 120, 0.50);
        assertThat(year, is(2));
    }
}