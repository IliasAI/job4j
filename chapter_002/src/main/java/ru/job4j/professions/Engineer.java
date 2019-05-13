package ru.job4j.professions;

/**
 * Engineer.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */
public class Engineer extends Profession {

    /**
     * Конструктор класса Engineer.
     *
     * @param name      имя инженера.
     * @param surname   фамилия инженера.
     * @param education образование.
     * @param birthday  год рождения.
     */
    public Engineer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Разрабатывает проект.
     *
     * @param projectName имя проекта.
     * @param projectType тип проекта.
     * @return готовый проект.
     */
    public Project designProject(String projectName, String projectType) {
        return new Project(projectName, projectType);
    }
}
