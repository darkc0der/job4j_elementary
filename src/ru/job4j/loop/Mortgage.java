package ru.job4j.loop;
/* 5.7. Ипотека [#393800] */

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * percent; // 100 * 0.5 = 150
            amount -= salary; // 150 - 70 = 80
            year++;
        }
        return year;
    }
}
