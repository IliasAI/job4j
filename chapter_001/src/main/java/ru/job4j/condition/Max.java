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

    /**
     * Выдает максимум из трех чисел.
     *
     * @param first  первое число.
     * @param second второе число.
     * @param third  третье число.
     * @return максимум из трех чисел.
     */
    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    /**
     * Выдает максимум из четырех чисел.
     *
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @param fourth четвертое число.
     * @return максимум из четырех чисел.
     */
    public int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }
}
