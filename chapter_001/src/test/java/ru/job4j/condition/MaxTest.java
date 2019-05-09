package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Max test
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        int expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMax0To0Then0() {
        Max max = new Max();
        int result = max.max(0, 0);
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenNegativeNumber4To2Then2() {
        Max max = new Max();
        int result = max.max(-4, -2);
        int expected = -2;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFirstMaxOfThree() {
        Max max = new Max();
        int result = max.max(6, 4, 3);
        int expected = 6;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFourthMaxOfFour() {
        Max max = new Max();
        int result = max.max(1, 0, 4, 9);
        int expected = 9;
        assertThat(result, is(expected));
    }
}
