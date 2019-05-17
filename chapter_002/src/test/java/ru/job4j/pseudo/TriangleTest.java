package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TriangleTest.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class TriangleTest {

    /**
     * Test draw triangle.
     */
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is(new StringBuilder()
                .append("    Δ   ")
                .append("   ΔΔΔ  ")
                .append("  ΔΔΔΔΔ ")
                .append("ΔΔΔΔΔΔΔΔΔ")
                .toString()
        ));
    }
}
