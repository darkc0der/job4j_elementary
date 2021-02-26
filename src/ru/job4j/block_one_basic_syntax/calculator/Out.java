package ru.job4j.block_one_basic_syntax.calculator;
/* 9.1. String [#393751] */

public class Out {
    public static void main(String[] args) {
        String lyrics = "Мама мыла раму";
        System.out.println(lyrics);
        String name = "Pavel";
        String surname = "ALekseev";
        String separate = " ";
        String id = name + separate + surname;
        System.out.println(id);
        byte age = 38;
        separate = " - ";
        id = name + separate + age + " years old";
        System.out.println(id);
    }
}
