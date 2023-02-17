package com.successdca;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Начать новую игру(Н) или выйти(В) из приложения ?");
            char select = readInput();
            if (select == 'Н') {
                Game.start();
            } else if (select == 'В') {
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Сделайте выбор ещё раз");
            }
        }
    }

    static char readInput() {
        return scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0);
    }
}
