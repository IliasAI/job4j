package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * TrackerTest.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class TrackerTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Test replace.
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Test findByName.
     */
    @Test
    public void whenFindByNameThenReturnItemsSameName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "test desc1", 123L);
        tracker.add(first);
        Item second = new Item("test1", "test desc2", 1234L);
        tracker.add(second);
        Item third = new Item("test3", "test desc3", 12345L);
        tracker.add(third);
        Item[] result = tracker.findByName("test1");
        assertThat(result.length, is(2));
    }

    /**
     * Test delete.
     */
    @Test
    public void whenDeleteItemThenTrue() {
        Tracker tracker = new Tracker();
        Item first = new Item("Test1", "test desc1", 123L);
        Item second = new Item("test2", "test desc2", 1234L);
        Item third = new Item("test3", "test desc3", 12345L);
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        boolean result = tracker.delete(first.getId());
        assertThat(result, is(true));
    }


    /**
     * Test findById.
     */
    @Test
    public void whenFindByIdThenGetItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("Test1", "test desc1", 123L);
        Item second = new Item("test2", "test desc2", 1234L);
        Item third = new Item("test3", "test desc3", 12345L);
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        Item result = tracker.findById(second.getId());
        assertThat(result, is(second));
    }

    /**
     * Test findAll.
     */
    @Test
    public void whenFindAllThenGetCutArray() {
        Tracker tracker = new Tracker();
        Item first = new Item("Test1", "test desc1", 123L);
        Item second = new Item("test2", "test desc2", 1234L);
        Item third = new Item("test3", "test desc3", 12345L);
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        Item[] result = tracker.findAll();
        assertThat(result.length, is(3));
    }
}
