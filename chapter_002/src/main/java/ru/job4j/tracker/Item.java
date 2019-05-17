package ru.job4j.tracker;

import java.util.Objects;

/**
 * Item.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version
 * since 1.0
 */

public class Item {
    private String id;
    private String name;
    private String desc;
    private long time;

    /**
     * Конструктор класса Item.
     * @param name имя заявки.
     * @param desc описание.
     * @param time время создания.
     */
    public Item(String name, String desc, long time) {
        this.name = name;
        this.desc = desc;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time
                && Objects.equals(id, item.id)
                && Objects.equals(name, item.name)
                && Objects.equals(desc, item.desc);
    }

    public int hashCode() {
        return Objects.hash(id, name, desc, time);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append("ID: ").append(id).append(" ").append("Task name: ").append(name).append(" ").append("Description: ").append(desc).append(" ").append("Create time: ").append(time));
    }
}
