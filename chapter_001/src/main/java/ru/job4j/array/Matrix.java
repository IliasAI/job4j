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
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
