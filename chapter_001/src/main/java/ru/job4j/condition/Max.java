package ru.job4j.condition;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Выдает максимум из двух чисел.
     *
     * @param left  первое число.
     * @param right второе число.
     * @return максимум из двух чисел.
     */
    public int max(int left, int right) {
        return left > right ? left : right;
    }
}
