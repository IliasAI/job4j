package ru.job4j.professions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * DoctorTest.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class DoctorTest {
    @Test
    public void whenDentistTreatSickPatientThenCured() {
        Dentist dentist = new Dentist("John", "Wick", "master", 1985);
        Patient patient = new Patient("Peter", 50);
        dentist.diagnostics(patient);
        patient = dentist.toTreat(patient);
        String result = patient.getDiagnose().getDiagnoseName();
        String expected = "Healthy";
        assertThat(result, is(expected));
    }

    @Test
    public void whenSurgeonTreatThenHealth100() {
        Surgeon surgeon = new Surgeon("James", "Brown", "master", 1972);
        Patient patient = new Patient("Alex", 30);
        surgeon.diagnostics(patient);
        patient = surgeon.toTreat(patient);
        int result = patient.getHealth();
        int expected = 100;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSurgeonMakeIncisionThenHealth100() {
        Surgeon surgeon = new Surgeon("James", "Brown", "master", 1972);
        Patient patient = new Patient("Antony", 10);
        patient = surgeon.makeIncision(patient);
        int result = patient.getHealth();
        int expected = 100;
        assertThat(result, is(expected));
    }

    @Test
    public void whenPatientIsDead() {
        Doctor doctor = new Doctor("Brandon", "Miller", "master", 1962);
        Patient patient = new Patient("Thomas", 0);
        doctor.diagnostics(patient);
        doctor.toTreat(patient);
        String result = patient.getDiagnose().getDiagnoseName();
        String expected = "Is dead...";
        assertThat(result, is(expected));
    }

    @Test
    public void whenDentistDrillToothThenTeethState100() {
        Dentist dentist = new Dentist("John", "Wick", "master", 1985);
        Patient patient = new Patient("Peter", 100, 76);
        patient = dentist.drillTooth(patient);
        int result = patient.getTeethState();
        int expected = 100;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDentistGetNameThenName() {
        Dentist dentist = new Dentist("John", "Wick", "master", 1985);
        String result = dentist.getName();
        String expected = "John";
        assertThat(result, is(expected));
    }
}
