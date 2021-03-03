package ru.job4j.condition;
/* 4.3.5. Множественное логическое выражение И [#393704] */
public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + bc > ac && bc + ac > ab && ac + ab > bc;
    }
}
