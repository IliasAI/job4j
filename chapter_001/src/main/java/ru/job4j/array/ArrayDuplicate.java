package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 */
public class ArrayDuplicate {

    /**
     * Метод убирает все дубликаты строк из массива.
     * @param array массив.
     * @return массив без дубликатов.
     */
    public String[] remove(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            String tmp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (tmp.equals(array[j])) {
                    array[j] = null;
                }
            }
        }

        for (int count = array.length - 1; count >= 1; count--) {
            for (int index = 0; index < count; index++) {
                if (array[index] == null) {
                    String tmp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = tmp;

                }
            }
        }
        return Arrays.copyOf(array, 3);
    }

}
