package ru.job4j.loop;

/**
 * @author Ilias Agakhanov
 * @version 1.0
 */
public class Factorial {
    /**
     * Метод рассчитывает факториал числа.
     * @param n число для расчета факториала.
     * @return факториал.
     */
    public int calc(int n) {
        int result = 1;
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }
}
