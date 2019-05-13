package ru.job4j.professions;

/**
 * Dentist.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */
public class Dentist extends Doctor {
    /**
     * Конструктор класса Dentist.
     *
     * @param name      имя дантиста.
     * @param surname   фамилия дантиста.
     * @param education образование.
     * @param birthday  год рождения.
     */
    public Dentist(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Лечит больной зубы пациента.
     *
     * @param patient больной пациент.
     * @return пациент со здоровыми зубами.
     */
    public Patient drillTooth(Patient patient) {
        patient.setTeeth(100);
        return patient;
    }
}
