package ru.job4j.array;

public class RollBackArray {

    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int last = array.length - 1 - index;
            int current = index;
            result[current] = array[last];
        }
        return result;
    }
}
