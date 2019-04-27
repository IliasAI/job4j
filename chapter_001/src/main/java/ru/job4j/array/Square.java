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
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}
