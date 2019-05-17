package ru.job4j.tracker;

/**
 * StartUI.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class StartUI {
    /**
     * Константы меню.
     */
    private static final String ADD = "0";
    private static final String SHOW_ALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FIND_BY_ID = "4";
    private static final String FIND_BY_NAME = "5";
    private static final String EXIT = "6";

    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            switch (answer) {
                case ADD:
                    this.createItem();
                    break;
                case SHOW_ALL:
                    this.showAll(tracker.findAll());
                    break;
                case EDIT:
                    this.editItem();
                    break;
                case DELETE:
                    this.deleteItem();
                    break;
                case FIND_BY_ID:
                    System.out.println(tracker.findById(this.input.ask("Введите ID заявки: ")).toString());
                    break;
                case FIND_BY_NAME:
                    showAll(tracker.findByName(this.input.ask("Введите имя для поиска:")));
                case EXIT:
                    exit = true;
                    break;
                default:
                    System.out.println("Такого пункта меню нет.");

            }
        }
    }

    /**
     * Удаляет заявку.
     */
    private void deleteItem() {
        String id = this.input.ask("Введите ID заявки: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена.\n");
        } else {
            System.out.printf("ID %s не найдено в хранилище.\n\n", id);
        }
    }

    /**
     * Позволяет редактировать заявку.
     */
    private void editItem() {
        String id = this.input.ask("Введите ID заявки: ");
        if (tracker.replace(id, doItem())) {
            System.out.println("Заявка успешно изменена.\n");
        } else {
            System.out.printf("ID %s не найдено в хранилище.\n\n", id);
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        Item item = doItem();
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * Метод отображает все заявки в хранилище.
     *
     * @param items хранилище заявок.
     */
    private void showAll(Item[] items) {
        for (Item item : items) {
            System.out.println(item.toString());
            System.out.println();
        }
    }

    /**
     * Метод создает заявку.
     *
     * @return заявка.
     */
    private Item doItem() {
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        long time = System.currentTimeMillis();
        return new Item(name, desc, time);
    }

    /**
     * Метод отображает меню в консоле.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by ID");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    /**
     * Запускт программы.
     *
     * @param args параметры.
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
