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

    @Test
    public void whenHasMonoVertical0() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '}
        };
        int column = 0;
        boolean rsl = MatrixCheck.monoVertical(board, column);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenHasMonoVertical1() {
        char[][] board = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '}
        };
        int column = 0;
        boolean rsl = MatrixCheck.monoVertical(board, column);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenHasMonoVertical2() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        int column = 2;
        boolean rsl = MatrixCheck.monoVertical(board, column);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenDiagonal() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] rsl = MatrixCheck.extractDiagonal(board);
        char[] expected = {'X', 'X', 'X'};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] board = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        boolean rsl = MatrixCheck.isWin(board);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] board = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        boolean rsl = MatrixCheck.isWin(board);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] board = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        boolean rsl = MatrixCheck.isWin(board);
        Assert.assertTrue(rsl);
    }
}