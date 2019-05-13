package ru.job4j.professions;

/**
 * App.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */
public class App {
    private String name;
    private String type;
    private String description;

    public App(String name, String type, String description) {
        this.description = description;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
