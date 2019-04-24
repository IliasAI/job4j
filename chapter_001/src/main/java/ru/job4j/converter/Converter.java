package ru.job4j.converter;

/**
 * Конвертор валюты.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version %I%, %G%;
 * @since 25.04.2019
 */
public class Converter {
    private final int EURO = 70;
    private final int USD = 60;
    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value/EURO;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары.
     */
    public int rubleToDollar(int value) {
        return value/USD;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        return value*EURO;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */
    public int dollarToRuble(int value) {
        return value*USD;
    }
}
