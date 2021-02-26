package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(double value) {
        return value / 89;
    }

    public static double rubleToDollar(double value) {
        return value / 73;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(10.0);
        double dollar = Converter.rubleToDollar(1.0);
        System.out.println("10 rubles are " + euro + " euro.");
        System.out.println("1 rubles are " + dollar + " dollar.");
    }
}
