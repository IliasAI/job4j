package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * MenuTracker.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class MenuTracker {
    /**
     * @param хранит ссылку на объект .
     */
    private Input input;
    /**
     * @param хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions.add(new AddItem(0, "Add program"));
        this.actions.add(new MenuTracker.ShowItems(1, "Show all items"));
        this.actions.add(new UpdateItem(2, "Edit item"));
        this.actions.add(new DeleteItem(3, "Delete item"));
        this.actions.add(new FindItemById(4, "Find item by Id"));
        this.actions.add(new FindItemsByName(5, "Find items by name"));
        this.actions.add(new ExitProgram(6, "Exit Program"));
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(String.format("%s. %s", action.key(), action.info()));
            }
        }
    }

    /**
     * ExitProgram.
     *
     * @author Ilias Agakhanov (ferr0rcode@gmail.com)
     * version 1.0
     * since 1.0
     */

    private class ExitProgram implements UserAction {
        private final int key;
        private final String definition;

        public ExitProgram(int key, String definition) {
            this.key = key;
            this.definition = definition;
        }

        @Override
        public int key() {
            return key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("До скорой встречи.");
        }

        @Override
        public String info() {
            return definition;
        }
    }

    /**
     * AddItem.
     *
     * @author Ilias Agakhanov (ferr0rcode@gmail.com)
     * version 1.0
     * since 1.0
     */

    private class AddItem implements UserAction {
        private final int key;
        private final String definition;

        public AddItem(int key, String definition) {
            this.key = key;
            this.definition = definition;
        }

        @Override
        public int key() {
            return key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Добавление новой заявки --------------");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            long time = System.currentTimeMillis();
            Item item = new Item(name, desc, time);
            tracker.add(item);
            System.out.println("------------ Новая заявка с ID : " + item.getId());
            System.out.println("------------ Новая заявка с именем : " + item.getName());
            System.out.println("------------ Новая заявка с описанием : " + item.getDesc());
            System.out.println("--------------------- Конец -----------------------");
        }

        @Override
        public String info() {
            return definition;
        }
    }

    /**
     * FindItemsByName.
     *
     * @author Ilias Agakhanov (ferr0rcode@gmail.com)
     * version 1.0
     * since 1.0
     */

    private class FindItemsByName implements UserAction {
        private final int key;
        private final String definition;

        public FindItemsByName(int key, String definition) {
            this.key = key;
            this.definition = definition;
        }

        @Override
        public int key() {
            return key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Поиск заявки по имени --------------");
            String name = input.ask("Введите имя заявки: ");
            Item[] items = tracker.findByName(name);
            for (Item item : items) {
                System.out.println(item.toString());
            }
            System.out.println("-------------------- Конец ----------------------");
        }

        @Override
        public String info() {
            return definition;
        }
    }

    /**
     * UpdateItem.
     *
     * @author Ilias Agakhanov (ferr0rcode@gmail.com)
     * version 1.0
     * since 1.0
     */

    private class UpdateItem implements UserAction {
        private final String definition;
        private final int key;

        public UpdateItem(int key, String definition) {
            this.key = key;
            this.definition = definition;
        }

        @Override
        public int key() {
            return key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Изменения заявки --------------");
            String id = input.ask("Введите ID заявки: ");
            long time = System.currentTimeMillis();
            Item item = new Item(input.ask("Введите имя заявки :"),
                    input.ask("Введите описание заявки :"),
                    time);
            if (tracker.replace(id, item)) {
                System.out.println("Заявка успешно изменена.\n");
            } else {
                System.out.printf("ID %s не найдено в хранилище.\n\n", id);
            }
            System.out.println("------------------ Конец --------------------");
        }

        @Override
        public String info() {
            return definition;
        }
    }

    /**
     * FindItemById.
     *
     * @author Ilias Agakhanov (ferr0rcode@gmail.com)
     * version 1.0
     * since 1.0
     */

    private class FindItemById implements UserAction {

        private final int key;
        private final String definition;

        public FindItemById(int key, String definition) {
            this.key = key;
            this.definition = definition;
        }

        @Override
        public int key() {
            return key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Поиск заявки по ID --------------");
            String id = input.ask("Введите ID заявки: ");
            Item item = tracker.findById(id);
            if (item == null) {
                System.out.println("Заявки с данным ID не найдено.");
            } else {
                System.out.println(item.toString());
            }
            System.out.println("------------------- Конец ---------------------");
        }

        @Override
        public String info() {
            return definition;
        }
    }

    /**
     * DeleteItem.
     *
     * @author Ilias Agakhanov (ferr0rcode@gmail.com)
     * version 1.0
     * since 1.0
     */

    private class DeleteItem implements UserAction {
        private final int key;
        private final String definition;

        public DeleteItem(int key, String definition) {
            this.key = key;
            this.definition = definition;
        }

        @Override
        public int key() {
            return key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Удаление заявки --------------");
            String id = input.ask("Введите ID заявки: ");
            if (tracker.delete(id)) {
                System.out.println("Заявка успешно удалена.\n");
            } else {
                System.out.printf("ID %s не найдено в хранилище.\n\n", id);
            }
            System.out.println("----------------- Конец -------------------");
        }

        @Override
        public String info() {
            return definition;
        }
    }

    /**
     * ShowItems.
     *
     * @author Ilias Agakhanov (ferr0rcode@gmail.com)
     * version 1.0
     * since 1.0
     */

    private static class ShowItems implements UserAction {

        private final int key;
        private final String definition;

        public ShowItems(int key, String definition) {
            this.key = key;
            this.definition = definition;
        }

        @Override
        public int key() {
            return key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Весь список заявок --------------");
            for (Item item : tracker.findAll()) {
                System.out.println(item.toString());
            }
            System.out.println("------------------- Конец ---------------------");
        }

        @Override
        public String info() {
            return definition;
        }
    }
}
