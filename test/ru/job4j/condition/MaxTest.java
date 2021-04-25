package ru.job4j.condition;
/* 4.2. Тернарное сравнение [#393701] */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void max() {
        assertThat(Max.max(-2, -1), is(-1));
    }
}