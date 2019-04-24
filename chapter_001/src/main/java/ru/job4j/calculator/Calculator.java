package ru.job4j.calculator;

/**
 * Class Calculator - простой калькулятор(задача 001, урок 3).
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version %I%, %G%
 * @since 24.04.2019
 */
public class Calculator {
    /**
     * @param first double variable.
     * @param second double variable.
     * @return first number plus second number.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * @param first double variable.
     * @param second double variable.
     * @return first number subtract second number
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * @param first double variable.
     * @param second double variable.
     * @return first number div second number
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * @param first double variable.
     * @param second double variable.
     * @return first number multiple second number
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}