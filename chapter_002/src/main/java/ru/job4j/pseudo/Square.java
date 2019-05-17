package ru.job4j.pseudo;

/**
 * Square.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class Square implements Shape {
    /**
     * Draw Square.
     * @return square.
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("☐☐☐☐");
        pic.append(System.lineSeparator());
        pic.append("☐   ☐");
        pic.append(System.lineSeparator());
        pic.append("☐   ☐");
        pic.append(System.lineSeparator());
        pic.append("☐☐☐☐");
        return pic.toString();
    }
}
