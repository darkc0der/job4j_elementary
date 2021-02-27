package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen16Euro() {
        double in = 140.0;
        double expected = 1.6;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.10);
    }

    @Test
    public void whenConvert180RblThen2Dollar() {
        double in = 180.0;
        double expected = 2.5;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.10);
    }
}