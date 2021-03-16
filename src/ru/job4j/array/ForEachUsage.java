package ru.job4j.array;

public class ForEachUsage {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five"};

        for (String str : numbers) {
            System.out.println("Numbers: " + str);
        }
    }
}
