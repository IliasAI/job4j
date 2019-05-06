package ru.job4j.array;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 * @since 29.04.2019
 */
public class Matrix {
    /**
     * Метод создает массив заданной велечины, помещая в него таблицу умножения.
     *
     * @param size размер массива.
     * @return массив с таблицей умножения.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int out = 0; out < size; out++) {
            for (int in = 0; in < size; in++) {
                table[out][in] = (out + 1) * (in + 1);
            }
        }
        return table;
    }
}
