package ru.job4j.professions;

/**
 * Project.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */
public class Project {
    private String projectName;
    private String projectType;

    /**
     * Конструктор класса Project.
     *
     * @param projectName имя проекта.
     * @param projectType тип проекта.
     */
    public Project(String projectName, String projectType) {
        this.projectName = projectName;
        this.projectType = projectType;

    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectType() {
        return projectType;
    }
}
