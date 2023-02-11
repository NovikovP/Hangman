package com.successdca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Game {
    static int errorCount;              // Учет ошибок
    static final int errorMax = 6;      // Максимальное количество ошибок
    static List<Character> errorChar;   // Учет неверно указанных букв
    static String secretWord;           // загаданное слово
    static String secretWordView;       // отображение загаданного слово
    static Scaffold scaffold;           // текущий вид виселицы


    public static void start() {
        String[] scaff = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX"};
        errorCount = 0;
        errorChar = new ArrayList<>();
        secretWord = WordChoice.getWorld().toUpperCase(Locale.ROOT);
        scaffold = Scaffold.valueOf(scaff[errorCount]);
        secretWordView = "_".repeat(secretWord.length());
        boolean vinnerFlug = true;

        while (vinnerFlug) {
            System.out.println(scaffold);
            // System.out.println("Загаданное слово:   " + secretWord);  // подсказка при отладке
            System.out.println("Загаданное слово:  " + secretWordView);
            System.out.println("Ошибки  (" + errorCount + "): " + errorChar);
            System.out.print("Введите букву: ");
            Character inputCharacter = Main.readInput();
            System.out.println("\n \n \n \n \n \n \n \n \n \n");

            if (secretWord.contains(String.valueOf(inputCharacter))) {
                char[] temp = secretWord.toCharArray();
                char[] tempVieew = secretWordView.toCharArray();

                for (int i = 0; i < secretWord.length(); i++) {
                    if (temp[i] == inputCharacter) {
                        tempVieew[i] = inputCharacter;
                    }
                }

                secretWordView = new String(tempVieew);
                if (!secretWordView.contains("_")) {
                    vinnerFlug = false;
                }
            } else {
                // обработка повторно введенной неверной буквы
                if (errorChar.contains(inputCharacter)) {
                    System.out.println("Вы уже вводили эту букву. Неверно");
                } else {
                    errorChar.add(inputCharacter);
                }
                errorCount++;
                scaffold = Scaffold.valueOf(scaff[errorCount]);
                if (errorCount == errorMax) vinnerFlug = false;
            }
        }

        if (errorCount != errorMax) {
            System.out.println("\n \n \tПоздравляем ! Вы выйграли ! \n \n");
        } else {
            System.out.println(Scaffold.SIX);
            System.out.println("\n \tВы проиграли, допустив много ошибок !  \n \n");
        }
    }
}
