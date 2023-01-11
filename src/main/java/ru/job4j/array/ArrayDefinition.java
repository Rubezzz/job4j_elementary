package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("ages length = " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("surnames length = " + surnames.length);
        float[] prices = new float[40];
        System.out.println("prices length = " + prices.length);

        String[] names = new String[4];
        names[0] = "Ivan";
        names[1] = "Igor";
        names[2] = "Dmitriy";
        names[3] = "Alex";
        System.out.println(names[0] + System.lineSeparator()
                           + names[1] + System.lineSeparator()
                           + names[2] + System.lineSeparator()
                           + names[3]);
    }
}
