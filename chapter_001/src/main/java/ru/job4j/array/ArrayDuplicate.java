package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 */
public class ArrayDuplicate {
    /**
     * Метод убирает все дубликаты строк из массива.
     *
     * @param array массив.
     * @return массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }

}
