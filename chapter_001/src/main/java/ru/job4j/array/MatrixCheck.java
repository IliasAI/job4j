package ru.job4j.array;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 */
public class MatrixCheck {
    /**
     * Метод проверяет, что все элементы массива по диагоналям равны true или false.
     *
     * @param data массив.
     * @return true или false в зависимости от результата.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[0][0] != data[index][index] || data[0][data.length - 1] != data[index][data.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
