package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 */
public class MatrixCheckTest {

    /**
     * Test odd number of elements - true.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test odd number of elements - false.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Test even number of elements - true.
     */
    @Test
    public void whenDataMonoByEvenNumberOfElementsThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {false, true, false, true},
                {true, false, true, true},
                {true, true, false, false},
                {true, true, true, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test even number of elements - false.
     */
    @Test
    public void whenDataMonoByEvenNumberOfElementsThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {false, true, false, true},
                {true, true, false, true},
                {true, true, false, false},
                {false, true, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}