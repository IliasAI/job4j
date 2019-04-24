package ru.job4j.converter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    /**
     * Converter test ruble to dollar.
     */
    @Test
    public void when60RubleToDollarThan1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        int expect = 1;
        assertThat(result, is(expect));
    }

    /**
     * Converter test ruble to euro.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        int expect = 1;
        assertThat(result, is(expect));
    }

    /**
     * Converter test dollar to ruble.
     */
    @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        int expect = 60;
        assertThat(result, is(expect));
    }

    /**
     * Converter test euro to ruble.
     */
    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        int expect = 70;
        assertThat(result, is(expect));
    }
}
