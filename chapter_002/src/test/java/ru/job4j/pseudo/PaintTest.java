package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;
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

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final String ln = System.lineSeparator();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    /**
     * Test draw square.
     */
    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("☐☐☐☐")
                                .append(ln)
                                .append("☐   ☐")
                                .append(ln)
                                .append("☐   ☐")
                                .append(ln)
                                .append("☐☐☐☐")
                                .append(ln)
                                .toString()
                )
        );
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
                                .append(ln)
                                .append("   ΔΔΔ  ")
                                .append(ln)
                                .append("  ΔΔΔΔΔ ")
                                .append(ln)
                                .append(" ΔΔΔΔΔΔΔ")
                                .append(ln)
                                .toString()
                ));
    }
}
