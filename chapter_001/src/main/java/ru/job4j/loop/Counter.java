package ru.job4j.loop;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version 1.0
 */
public class Counter {
    /**
     * Метод вычисляет сумму четных чисел в диапазоне.
     *
     * @param start  начало диапазона.
     * @param finish конец диапазона.
     * @return сумма четных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int number = start; number <= finish; number++) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
