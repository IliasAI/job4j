package ru.job4j.loop;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version 1.0
 */
public class Board {
    /**
     * Метод рисует доску заданных размеров.
     * @param width ширина доски.
     * @param height высота доски.
     * @return доска.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int out = 0; out < height; out++) {
            for (int in = 0; in < width; in++) {
                if ((out + in) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}