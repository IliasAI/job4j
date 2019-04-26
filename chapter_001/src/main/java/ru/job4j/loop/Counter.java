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
//        while (start <= finish) {
//            if (start % 2 == 0) {
//                sum += start;
//            }
//            start++;
//        }
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
