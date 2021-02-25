package ru.job4j.block_one_basic_syntax.calculator;

public class ArgMethod {
    public static void print(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        String name = "Pavel Alekseev";
        ArgMethod.print(name);
    }
}
