package ru.job4j.condition;
// 9. Площадь треугольника. [#393747]
/*  В этом задании нам нужно будет написать формулу вычисления площади треугольника.
    Площадь треугольника вычисляется по формуле Герона.
    s = sqrt(p(p - a) * (p - b) * (p - c)
    где a, b и с - это длины сторон, а P - это полупериметр.
    Полупериметр вычисляется как сумма всех сторон, деленная на 2.
    Давайте сделаем каркас класса. */

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) " + rsl);

        rsl = TrgArea.area(5, 5, 8);
        System.out.println("area (5, 5, 8) " + rsl);

        rsl = TrgArea.area(1, 2, 1);
        System.out.println("area (1, 2, 1) " + rsl);
    }
}
