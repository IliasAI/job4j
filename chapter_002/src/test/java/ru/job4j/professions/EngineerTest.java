package ru.job4j.professions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * EngineerTest.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class EngineerTest {
    @Test
    public void whenProgrammerMakeAppThenApp() {
        Programmer programmer = new Programmer("Taylor", "Moore", "bachelor", 1991);
        Project project = programmer.designProject("PUBG", "Mobile app");
        App app = programmer.makeApp(project, "Battle royal game");
        String result = app.getName();
        String expected = "PUBG";
        assertThat(result, is(expected));
    }

    @Test
    public void whenBuilderBuildHouseThenHouse() {
        Builder builder = new Builder("Henry", "Ford", "master", 1985);
        Project project = builder.designProject("Green House", "Residential complex");
        House home = builder.buildHouse(project, 5, 10);
        String result = home.getHouseName();
        String expected = "Green House";
        assertThat(result, is(expected));
    }

    @Test
    public void whenProgrammerMakeAppThenExperience1() {
        Programmer programmer = new Programmer("Taylor", "Moore", "bachelor", 1991);
        Project project = programmer.designProject("Telegram", "desktop app");
        programmer.makeApp(project, "Messenger PC version");
        int result = programmer.getExperience();
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetNameThenName() {
        Programmer programmer = new Programmer("Taylor", "Moore", "bachelor", 1991);
        String result = programmer.getName();
        String expected = "Taylor";
        assertThat(result, is(expected));
    }
}
