package ru.job4j.loop;
/* 5.5. Простое число [#393801] */

public class SeqNumber {
    public static void calc(int n) {
        int hold = 0;
        for (int i = 1; i <= n; i++) {
            hold += i;
            if (hold == n) {
                System.out.println("Success");
                break;
            } else if (hold > n) {
                System.out.println("Not possible");
                break;
            }
            System.out.println(hold);
        }
    }

    public static void main(String[] args) {
        calc(6);
        calc(5);
    }
}
