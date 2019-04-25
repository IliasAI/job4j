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
}
