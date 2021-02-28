package ru.job4j.condition;
/* 4.1.1. Операторы сравнения в String. [#393690] */
public class StringEq {
    public static void main(String[] args) {
        String first = new String("one");
        String one = new String("one");
        if (first.equals(one)) {
            System.out.println("first equals one");
        } else {
            System.out.println("first does not equals one");
        }
    }
}
