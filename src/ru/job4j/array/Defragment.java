package ru.job4j.array;
/* 6.8. Дефрагментация массива [#393736] */

public class Defragment {
    public static String[] compress(String[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                int isNull = i;
                for (int j = i; j < data.length; j++) {
                    if (data[j] != null) {
                        int isNotNull = j;
                        SwitchArray.swap(data, isNull, isNotNull);
                        break;
                    }
                }
            }
            System.out.print(data[i] + " ");
        }
        return data;
    }
}
