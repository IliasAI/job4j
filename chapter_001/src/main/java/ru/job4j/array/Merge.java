package ru.job4j.array;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            if (i < left.length) {
                rsl[i] = left[i];
            }
            if (i < right.length) {
                rsl[(rsl.length - right.length) + i] = right[i];
            }
        }
        return rsl;
    }
}