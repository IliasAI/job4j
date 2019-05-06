package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Рисует правую сторону пирамиды.
     *
     * @param height высота пирамиды.
     * @return пирамида.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Рисует левую сторону пирамиды.
     *
     * @param height высота пирамиды.
     * @return пирамида.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Рисует пирамиду.
     *
     * @param height высота пирамиды.
     * @return пирамида.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     *
     * @param height высота пирамиды.
     * @param widht ширина пирамиды.
     * @param predict условие проставления галки.
     * @return рисует галку.
     */
    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}