package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double amountPlusPercent = amount + (amount * percent / 100);
        while (amountPlusPercent > salary) {
            amountPlusPercent -= salary;
            amountPlusPercent += amountPlusPercent * percent / 100;
            year++;
        }
        return year;
    }
}
