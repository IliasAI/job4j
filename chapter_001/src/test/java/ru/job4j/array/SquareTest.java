package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ilias Agakhanov
 * @version 0.1
 */
public class SquareTest {
    /**
     * Test bound 3.
     */
    @Test
    public void whenBound3Then149() {
        Square square = new Square();
        int[] result = square.calculate(3);
        int[] expected = {1, 4, 9};
        assertThat(result, is(expected));
    }

    /**
     * Test bound 7.
     */
    @Test
    public void whenBound7Then14916253649() {
        Square square = new Square();
        int[] result = square.calculate(7);
        int[] expected = {1, 4, 9, 16, 25, 36, 49};
        assertThat(result, is(expected));
    }
}
