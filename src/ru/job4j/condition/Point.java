package ru.job4j.condition;

/* 7. Расстояние между точками в системе координат [#393755] */
// d = sqrt((x2 - x1)^2 + (y2 - y1^2));
public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result0 = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(3, 2, 2, 5);
        double result2 = Point.distance(10, 5, 6, 9);
        System.out.println("result0 (0, 0) to (2, 0) " + result0);
        System.out.println("result1 (3, 2) to (2, 5) " + result1);
        System.out.println("result2 (10, 5) to (6, 9) " + result2);
    }
}
