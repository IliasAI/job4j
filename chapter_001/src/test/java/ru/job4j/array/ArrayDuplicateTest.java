package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ilias Agakhanov(ferr0rcode@gmail.com)
 */
public class ArrayDuplicateTest {

    /**
     * Test remove duplicates.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplicate.remove(input);
        String[] expected = {"Привет", "Мир", "Супер"};
        assertThat(result, is(expected));
    }

    /**
     * Test remove duplicates more.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Привет", "Привет", "Супер", "Привет", "Привет", "Java", "Java"};
        String[] result = arrayDuplicate.remove(input);
        String[] expected = {"Привет", "Супер", "Java"};
        assertThat(result, is(expected));
    }
}

