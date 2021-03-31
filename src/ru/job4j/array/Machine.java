package ru.job4j.array;
/* 6.9. Жадный алгоритм. Сдача в кофе машине [#393709] */
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;

/*        for (int i = 0; i < coins.length; i++) {
            while (sum >= coins[i]) {
                rsl[size++] = coins[i];
                sum -= coins[i];
            }
        }*/

        while (sum > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (sum >= coins[i]) {
                    rsl[size++] = coins[i];
                    sum -= coins[i];
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
