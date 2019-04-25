package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    /**
     * Test first max.
     */
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(6, 4, 3);
        assertThat(result, is(6));
    }

    /**
     * Test second max.
     */
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    /**
     * Test third max.
     */
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(0, 0, 1);
        assertThat(result, is(1));
    }

    /**
     * Test equals all number.
     */
    @Test
    public void whenEqualsAll() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 3, 3);
        assertThat(result, is(3));
    }
}