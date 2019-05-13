package ru.job4j.professions;

/**
 * House.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */
public class House {
    private String houseName;
    private String houseType;
    private int number;
    private int height;

    /**
     * Конструктор класса House.
     *
     * @param houseName название дома.
     * @param houseType тип здания.
     * @param number    номер здания.
     * @param height    высота здания.
     */
    public House(String houseName, String houseType, int number, int height) {
        this.houseName = houseName;
        this.houseType = houseType;
        this.number = number;
        this.height = height;
    }

    public int getNumber() {
        return this.number;
    }

    public int getHeight() {
        return this.height;
    }

    public String getHouseName() {
        return houseName;
    }

    public String getHouseType() {
        return houseType;
    }
}
