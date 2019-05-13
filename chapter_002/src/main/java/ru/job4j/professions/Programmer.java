package ru.job4j.professions;

/**
 * Programmer.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */
public class Programmer extends Engineer {
    private int experience;

    /**
     * Конструктор класса Programmer.
     *
     * @param name      имя программиста.
     * @param surname   фамилия программиста.
     * @param education образование.
     * @param birthday  год рождения.
     */
    public Programmer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Создает приложение.
     *
     * @param project     проект.
     * @param description описание приложения.
     * @return готовый продукт.
     */
    public App makeApp(Project project, String description) {
        App app = new App(project.getProjectName(), project.getProjectType(), description);
        experience++;
        return app;
    }

    public int getExperience() {
        return experience;
    }
}
