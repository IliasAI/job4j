package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ilias Agakhanov
 */
public class CounterTest {
    /**
     * Test sum of a range of numbers.
     */
    @Test
    public void whenRange1To10Then30() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }

    /**
     * Test negative numbers.
     */
    @Test
    public void whenSumEvenNumbersFromMinusFiveToTenThen24() {
        Counter counter = new Counter();
        int result = counter.add(-5, 10);
        int expected = 24;
        assertThat(result, is(expected));
    }

}
