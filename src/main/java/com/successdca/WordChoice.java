package com.successdca;

import java.util.*;

public class WordChoice {
    public static String getWorld(){
        // тут выбираем слово
        List<String> stringList = new ArrayList<>(Arrays.asList(
                "телефон", "звонок", "разговор", "фильм", "кино" ,"сериал","окно",
                "полотенце", "крыльцо", "кот", "собака", "стол","стул",  "шкаф",
                "вещь", "работа", "мама", "голова", "школа", "сон"));
        int random = new Random().nextInt();
        return stringList.stream().sorted(Comparator.comparingInt(o -> System.identityHashCode(o) ^ random)).findFirst().get();
    }
}
