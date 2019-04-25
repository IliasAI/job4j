package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    /**
     * Triangle test
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Создаем объект треугольник.
        Triangle triangle = new Triangle();
        // Вычисляем площадь.
        double result = triangle.area(0, 0, 0, 2, 2, 0);
        // Задаем ожидаемый результат.
        double expected = 2D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenAreaSetMoreThreePointsThenTriangleArea() {
        Triangle triangle = new Triangle();
        double result = triangle.area(3, 5, 3, 0, 0, 0);
        double expected = 7.5D;
        assertThat(result, closeTo(expected, 0.1));
    }
}
