package ru.job4j.array;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version "Id"
 */
public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int index = 0; index < rsl.length; index++) {
            if (index < left.length) {
                rsl[index] = left[index];
            }
            if (index < right.length) {
                rsl[(rsl.length - right.length) + index] = right[index];
            }
        }
        return rsl;
    }
}