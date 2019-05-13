package ru.job4j.professions;

/**
 * Builder.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */
public class Builder extends Engineer {
    private int buildCount;

    public Builder(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public House buildHouse(Project project, int number, int height) {
        House house = new House(project.getProjectName(), project.getProjectType(), number, height);
        buildCount++;
        return house;
    }

    public int getBuildCount() {
        return buildCount;
    }
}
