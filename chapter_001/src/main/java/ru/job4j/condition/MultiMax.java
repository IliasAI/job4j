package ru.job4j.condition;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MultiMax {
    /**
     * Вычисление максимума из трех чисел.
     *
     * @param first  первое число.
     * @param second второе число.
     * @param third  третье число.
     * @return максимум из трех чисел.
     */
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = result > third ? result : third;
        return result;
    }
}
