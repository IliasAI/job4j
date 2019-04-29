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
        for (int i = 0; i < data.length; i++) {
            if (data[0][0] != data[i][i] || data[0][0] != data[i][data.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
