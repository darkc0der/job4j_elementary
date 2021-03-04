package ru.job4j.condition;
/* 4.6.1. Switch [#393697] */
public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Error";
        }
        return name;
    }

    public static void main(String[] args) {
        String name = SwitchWeek.nameOfDay(8);
        System.out.println("Day of week " + name);
    }
}
