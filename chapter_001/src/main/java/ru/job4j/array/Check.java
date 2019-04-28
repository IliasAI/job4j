package ru.job4j.array;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 */
public class Check {
    /**
     * Метод проверяет, что все элементы в массиве являются true или false.
     *
     * @param data массив.
     * @return true - если одинаковые, false - если различаются.
     */
    public boolean mono(boolean[] data) {
        for (boolean element : data) {
            if (element != data[0]) {
                return false;
            }
        }
        return true;
    }
}
