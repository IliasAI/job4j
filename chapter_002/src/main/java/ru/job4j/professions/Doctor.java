package ru.job4j.professions;

/**
 * Доктор.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Doctor extends Profession {

    /**
     * Конструктор класса Doctor.
     *
     * @param name      имя.
     * @param surname   фамилия.
     * @param education образование.
     * @param birthday  год рождения.
     */
    public Doctor(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Производит диагностику пациента.
     *
     * @param patient пациент
     * @return диагноз.
     */
    public Diagnose diagnostics(Patient patient) {
        Diagnose diagnose = new Diagnose();
        diagnose.findOut(patient);
        patient.setDiagnose(diagnose);
        return diagnose;
    }

    /**
     * Метод восстанавливает здоровье пациента на 1 еденицу.
     *
     * @param patient пациент
     */
    private void heal(Patient patient) {
        patient.setHealth(patient.getHealth() + 1);
    }

    /**
     * Метод лечит пациента на основе кол-ва едениц здоровья.
     *
     * @param patient больной пациент.
     * @return здоровый пациент.
     */
    public Patient toTreat(Patient patient) {
        Diagnose diagnose = diagnostics(patient);
        if (patient.getHealth() <= 0) {
            return patient;
        }
        while (patient.getHealth() < 100) {
            heal(patient);
        }
        diagnose.setDiagnoseName("Healthy");
        patient.setDiagnose(diagnose);
        return patient;
    }
}
