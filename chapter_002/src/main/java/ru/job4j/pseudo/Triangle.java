package ru.job4j.pseudo;

/**
 * Triangle.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class Triangle implements Shape {

    /**
     * Method draw triangle.
     * @return triangle.
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("    Δ   ");
        pic.append(System.lineSeparator());
        pic.append("   ΔΔΔ  ");
        pic.append(System.lineSeparator());
        pic.append("  ΔΔΔΔΔ ");
        pic.append(System.lineSeparator());
        pic.append(" ΔΔΔΔΔΔΔ");
        return pic.toString();
    }
}
