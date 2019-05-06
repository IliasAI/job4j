package ru.job4j.loop;

/**
 * @author Ilias Agakhanov
 * @version 1.0
 */
public class Factorial {
    /**
     * Метод рассчитывает факториал числа.
     * @param number число для расчета факториала.
     * @return факториал.
     */
    public int calc(int number) {
        int result = 1;
        if (number != 0) {
            for (int count = 1; count <= number; count++) {
                result *= count;
            }
        }
        return result;
    }
}
