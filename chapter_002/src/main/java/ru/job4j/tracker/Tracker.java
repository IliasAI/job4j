package ru.job4j.tracker;

import java.util.*;

/**
 * Tracker.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];


    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    private static final Random RN = new Random();

    /**
     * Метод реализующий добавление заявки в хранилище.
     *
     * @param item новая заявка.
     * @return заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
    }

    /**
     * Метод заменяет заявку с заданым id в массиве (@link Tracker#items) на заданную заявку переданную в параметре.
     *
     * @param id   заданый id.
     * @param item заданная заявка.
     * @return true если замена удалась.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                item.setId(id);
                items[index] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Удаляет заявку из массива по заданному id.
     *
     * @param id заданный id.
     * @return true если удалось удалить.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                System.arraycopy(items, index + 1, items, index, position - index);
                position--;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Возвращает массив с заявками.
     *
     * @return массив с заявками.
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    /**
     * Осуществляет поиск заявок в массиве по имени.
     *
     * @param key заданное имя для поиска.
     * @return массив содержащий все заявки с заданным именем.
     */
    public Item[] findByName(String key) {
        int length = 0;
        Item[] result = new Item[position];
        for (int index = 0; index < position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[length++] = this.items[index];
            }
        }
        return Arrays.copyOf(result, length);
    }

    /**
     * Осуществляет поиск заявки в массиве (@link Tracker#items) по id.
     *
     * @param id заданный id для поиска.
     * @return найденая заявка.
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                result = items[index];
                break;
            }
        }
        return result;
    }

}
