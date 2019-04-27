package ru.job4j.array;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 */
public class FindLoop {

    /**
     * Этот метод реализует поиск элемента в массиве.
     * @param data массив.
     * @param el элемент.
     * @return индекс массива.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
