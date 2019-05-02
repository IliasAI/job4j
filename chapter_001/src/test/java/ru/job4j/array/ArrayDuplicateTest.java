package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
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
        assertThat(result, arrayContainingInAnyOrder(expected));
    }

    /**
     * Test remove duplicates more.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Привет", "Привет", "Супер", "job4j", "Привет", "Java", "Java"};
        String[] result = arrayDuplicate.remove(input);
        String[] expected = {"Привет", "Java", "job4j", "Супер"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }

    /**
     * Test remove duplicates more.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate3() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Привет", "Привет"};
        String[] result = arrayDuplicate.remove(input);
        String[] expected = {"Привет"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }
}

