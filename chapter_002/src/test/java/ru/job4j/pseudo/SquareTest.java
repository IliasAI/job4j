package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * SquareTest.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class SquareTest {
    /**
     * Test draw square.
     */
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("☐☐☐☐")
                                .append("☐   ☐")
                                .append("☐   ☐")
                                .append("☐☐☐☐")
                                .toString()
                )
        );
    }
}
