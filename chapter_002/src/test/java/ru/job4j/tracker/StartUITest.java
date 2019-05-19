package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * StartUITest.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class StartUITest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final String ln = System.lineSeparator();
    private final StringBuilder menu = new StringBuilder()
            .append("Меню.")
            .append(ln)
            .append("0. Add new item")
            .append(ln)
            .append("1. Show all items")
            .append(ln)
            .append("2. Edit item")
            .append(ln)
            .append("3. Delete item")
            .append(ln)
            .append("4. Find item by ID")
            .append(ln)
            .append("5. Find items by name")
            .append(ln)
            .append("6. Exit Program")
            .append(ln);


    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    /**
     * Test add item.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }

    /**
     * Test edit item.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 123L));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    /**
     * Test delete item.
     */
    @Test
    public void whenDeleteThenTrackerDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Test name", "desc", 123L));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertNull(tracker.findById(item.getId()));
    }

    /**
     * Test find all.
     */
    @Test
    public void whenFindAllThenShowAll() {
        Tracker tracker = new Tracker();
        Item first = tracker.add(new Item("test first", "desc", 123L));
        Item second = tracker.add(new Item("test second", "desc", 1234L));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append(ln)
                .append("ID: ")
                .append(first.getId())
                .append(" Task name: test first Description: desc Create time: 123")
                .append(ln)
                .append(ln)
                .append("ID: ")
                .append(second.getId())
                .append(" Task name: test second Description: desc Create time: 1234")
                .append(ln)
                .append(ln)
                .append(menu)
                .append(ln)
                .toString()));
    }

    /**
     * Test find by id.
     */
    @Test
    public void whenFindByIdThenGetItem() {
        Tracker tracker = new Tracker();
        Item first = tracker.add(new Item("test first", "desc", 123L));
        first.setId("1");
        Item second = tracker.add(new Item("test second", "desc", 1234L));
        Input input = new StubInput(new String[]{"4", "1", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append(ln)
                .append("ID: ")
                .append(first.getId())
                .append(" Task name: test first Description: desc Create time: 123")
                .append(ln)
                .append(ln)
                .append(menu)
                .append(ln)
                .toString()));
    }

    /**
     * Test find by name.
     */
    @Test
    public void whenFindByNameThenGetItem() {
        Tracker tracker = new Tracker();
        Item first = tracker.add(new Item("test first", "desc", 123L));
        Item second = tracker.add(new Item("test second", "desc any", 1234L));
        Item third = tracker.add(new Item("test second", "desc old", 123465L));
        Input input = new StubInput(new String[]{"5", "test second", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(menu)
                .append(ln)
                .append("ID: ")
                .append(second.getId())
                .append(" Task name: test second Description: desc any Create time: 1234")
                .append(ln)
                .append(ln)
                .append("ID: ")
                .append(third.getId())
                .append(" Task name: test second Description: desc old Create time: 123465")
                .append(ln)
                .append(ln)
                .append(menu)
                .append(ln)
                .toString()));
    }
}
