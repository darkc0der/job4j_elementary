package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal1() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean rsl = MatrixCheck.monoHorizontal(board, row);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenHasMonoHorizontal2() {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', ' '}
        };
        int row = 2;
        boolean rsl = MatrixCheck.monoHorizontal(board, row);
        Assert.assertFalse(rsl);
    }
}