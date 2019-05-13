package ru.job4j.professions;

/**
 * Surgeon.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */
public class Surgeon extends Doctor {
    /**
     * Конструктор класса Surgeon.
     *
     * @param name      имя хирурга.
     * @param surname   фамилия хирурга.
     * @param education образование.
     * @param birthday  год рождения.
     */
    public Surgeon(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Делает надрез пациенту, после окончания метода пациент получает health == 100.
     *
     * @param patient пациент.
     * @return здоровый пациент health == 100.
     */
    public Patient makeIncision(Patient patient) {
        patient.setHealth(100);
        return patient;
    }
}
