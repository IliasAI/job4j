package ru.job4j.tracker;

import java.util.Scanner;

/**
 * ConsoleInput.
 *
 * @author Ilias Agakhanov (ferr0rcode@gmail.com)
 * version 1.0
 * since 1.0
 */

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public String askID() {
        System.out.println("Введите ID заявки: ");
        return scanner.nextLine();
    }
}
