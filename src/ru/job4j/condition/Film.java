package ru.job4j.condition;
/* 4.2. Тернарное сравнение [#393701] */
public class Film {
    public static String permission(int age) {
        boolean can = age >= 18;
        return can ? "Please, enjoy it." : "You can't watch it.";
    }

    public static void main(String[] args) {
        String msg = Film.permission(33);
        System.out.println(msg);
    }
}
