package ru.job4j.professions;

/**
 * Diagnose.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */
public class Diagnose {
    private String diagnoseName;

    /**
     * Метод ставит диагноз пациенту на основе кол-ва health.
     *
     * @param patient пациент.
     */
    public void findOut(Patient patient) {
        if (patient.getHealth() > 90) {
            diagnoseName = "Healthy";
        } else if (patient.getHealth() < 90 && patient.getHealth() > 60) {
            diagnoseName = "Mild illness";
        } else if (patient.getHealth() < 60 && patient.getHealth() > 30) {
            diagnoseName = "Secondary disease";
        } else if (patient.getHealth() < 30 && patient.getHealth() > 5) {
            diagnoseName = "Serious disease";
        } else if (patient.getHealth() < 5 && patient.getHealth() > 0) {
            diagnoseName = "At death's door";
        } else {
            diagnoseName = "Is dead...";
        }
    }

    public void setDiagnoseName(String diagnoseName) {
        this.diagnoseName = diagnoseName;
    }

    public String getDiagnoseName() {
        return this.diagnoseName;
    }
}
