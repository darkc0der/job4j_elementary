package ru.job4j.loop;
/* 5.4. Протеиновая диета [#393798] */

public class Income {
    public static void main(String[] args) {
        int income = 0;
        while (income < 100) {
            System.out.println(income);
            income += 10;
        }
    }
}
