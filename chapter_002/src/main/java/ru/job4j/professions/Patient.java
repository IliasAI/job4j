package ru.job4j.professions;

/**
 * Пациент.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Patient {
    private String name;
    private int health;
    private Diagnose diagnose;
    private int teethState;

    /**
     * Конструктор класса Patient.
     *
     * @param name   имя пациента.
     * @param health здоровье пациента.
     */
    public Patient(String name, int health) {
        this.name = name;
        this.health = health;
    }

    /**
     * Расширенный конструктор класса Patient.
     * @param name имя пациента.
     * @param health здоровье пациента.
     * @param teethState состояние зубов.
     */
    public Patient(String name, int health, int teethState) {
        this.name = name;
        this.health = health;
        this.teethState = teethState;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setDiagnose(Diagnose diagnose) {
        this.diagnose = diagnose;
    }

    public Diagnose getDiagnose() {
        return diagnose;
    }

    public void setTeeth(int teethState) {
        this.teethState = teethState;
    }

    public int getTeethState() {
        return teethState;
    }
}
