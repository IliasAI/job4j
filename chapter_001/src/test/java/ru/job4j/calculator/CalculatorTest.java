package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Calculator test.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version %I%, %G%
 * @since 24.04.2019
 */

public class CalculatorTest {
    /**
     * Test Add.
     */

    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test Subtract.
     */

    @Test
    public void whenSubtractSixAndTwoThenFour() {
        Calculator calc = new Calculator();
        double result = calc.subtract(6D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }

    /**
     * Test Div.
     */

    @Test
    public void whenDivTwoAndTwoThenOne() {
        Calculator calc = new Calculator();
        double result = calc.div(2D, 2D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Test Multiple.
     */

    @Test
    public void whenMultipleTwoAndFiveThenTen() {
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 5D);
        double expected = 10D;
        assertThat(result, is(expected));
    }
}
