package ru.job4j.pseudo;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * PaintTest.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class PaintTest {

    private PrintStream stdout = System.out;
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Test draw square.
     */
    @Test
    public void whenDrawSquare() {
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("☐☐☐☐")
                                .append("☐   ☐")
                                .append("☐   ☐")
                                .append("☐☐☐☐")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }

    /**
     * Test draw triangle.
     */
    @Test
    public void whenDrawTriangle() {
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("    Δ   ")
                                .append("   ΔΔΔ  ")
                                .append("  ΔΔΔΔΔ ")
                                .append("ΔΔΔΔΔΔΔΔΔ")
                                .append(System.lineSeparator())
                                .toString()
                ));

    }
}
