package ru.job4j.professions;

/**
 * Profession.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;

    /**
     * Default конструктор.
     */
    public Profession() {
    }

    /**
     * Конструктор класса Profession.
     *
     * @param name      имя.
     * @param surname   фамилия.
     * @param education образование.
     * @param birthday  год рождения.
     */
    public Profession(String name, String surname, String education, int birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }
}
