package ru.job4j.array;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 */
public class BubbleSort {
    /**
     * Метод сортирует массив методом перестановки.
     *
     * @param array массив.
     * @return отсортированный массив.
     */
    public int[] sort(int[] array) {
        for (int count = array.length - 1; count >= 1; count--) {
            for (int index = 0; index < count; index++) {
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = tmp;
                }
            }
        }
        return array;
    }
}
