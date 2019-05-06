package ru.job4j.array;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version 1.0
 * @since 28.04.2019
 */
public class Square {
    /**
     * Метод заполняет массив числами, возведенными в квадрат.
     * @param bound величина елементов в массиве.
     * @return массив заполненный числами.
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index < bound; index++) {
            result[index] = (int) Math.pow(index + 1, 2);
        }
        return result;
    }
}
