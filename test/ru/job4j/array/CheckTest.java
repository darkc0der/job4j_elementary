package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = {true, true, true};
        boolean rsl = Check.mono(data);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = {true, false, true};
        boolean rsl = Check.mono(data);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = {false, false, false};
        boolean rsl = Check.mono(data);
        Assert.assertTrue(rsl);
    }
}