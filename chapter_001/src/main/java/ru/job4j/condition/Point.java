package ru.job4j.condition;

/**
 * Расчет расстояния между точками в системе координат.
 *
 * @author Ilias Agakhanov.
 * @version 1.0
 */
public class Point {
    /**
     * Это поля объекта. Они доступны только конкретному объекту.
     */
    private int x;
    private int y;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка".
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Расчет расстояния.
     *
     * @return расстояние между точками.
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
