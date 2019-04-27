package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ilias Agakhanov
 */
public class FindLoopTest {

    /**
     * Test find success.
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expected = 0;
        assertThat(result, is(expected));
    }

    /**
     * Test find fail.
     */
    @Test
    public void whenArrayNotFindElement() {
        FindLoop find = new FindLoop();
        int[] input = {1, 3, 7, 9};
        int value = 11;
        int result = find.indexOf(input, value);
        int expected = -1;
        assertThat(result, is(expected));
    }
}
