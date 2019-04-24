package ru.job4j.condition;

/**
 * Расчет расстояния между точками в системе координат.
 * @author Ilias Agakhanov.
 * @version 1.0
 */
public class Point {
    /**
     * Расчет расстояния.
     * @param x1 точка координаты.
     * @param y1 точка координаты.
     * @param x2 точка координаты.
     * @param y2 точка координаты.
     * @return расстояние между точками.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first+second);
    }
}
