package ru.job4j.array;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 * @since 28.04.2019
 */
public class Turn {
    /**
     * Метод принимает массив, зеркально переворачивает элементы массива и возвращает.
     *
     * @param array массив.
     * @return перевернутый массив.
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (index <= (array.length - 1) / 2) {
                int tmp = array[index];
                array[index] = array[(array.length - 1) - index];
                array[(array.length - 1) - index] = tmp;
            } else {
                break;
            }
        }
        return array;
    }
}
