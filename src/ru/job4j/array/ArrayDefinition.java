package ru.job4j.array;

import java.sql.SQLOutput;

public class ArrayDefinition {
    public static void main(String[] args) {

        short[] ages = new short[10];
        System.out.println("Size ages: " + ages.length);

        String[] surname = new String[100500];
        System.out.println("Size surname: " + surname.length);

        float[] prices = new float[40];
        System.out.println("Size prices: " + prices.length);

        String[] names = new String[4];
        names[0] = "Надя";
        names[1] = "Катя";
        names[2] = "Кристина";
        names[3] = "Иринка";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
