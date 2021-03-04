package ru.job4j.condition;
/* 4.6.2. Switch - matcher [#393698] */
public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
          case "Monday", "Понедельник", "Day is monday" -> 1;
          case "Tuesday" -> 2;
          case "Wednesday" -> 3;
          case "Thursday" -> 4;
          case "Friday" -> 5;
          case "Saturday" -> 6;
          case "Sunday" -> 7;
          default -> 0;

        };
    }

    public static void main(String[] args) {
        int rsl = MultipleSwitchWeek.numberOfDay("Not a number");
        System.out.println("Number of week " + rsl);

        rsl = MultipleSwitchWeek.numberOfDay("Понедельник");
        System.out.println("Number of week " + rsl);

        rsl = MultipleSwitchWeek.numberOfDay("Day is monday");
        System.out.println("Number of week " + rsl);
    }
}
