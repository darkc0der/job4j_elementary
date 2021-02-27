package ru.job4j.converter;

import java.text.DecimalFormat;

public class Converter {
    public static double rubleToEuro(double value) {
        double res = (value / 89);
        double scale = Math.pow(10, 1);
        double temp = res * scale;
        temp = Math.ceil(temp);
        temp = temp / scale;
        return temp;
    }

    public static double rubleToDollar(double value) {
        double res = value / 73;
        double scale = Math.pow(10, 1); // 1 количество знаков после запятой
        return Math.ceil(res * scale) / scale;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");

        double in = 140;
        double expected = 1.6;
        double out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 1.6. Test result : " + passed);
    }
}
