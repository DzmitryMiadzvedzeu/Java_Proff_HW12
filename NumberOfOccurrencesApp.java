package com.telran.org.homeworktwelve;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurrencesApp {
    public static void main(String[] args) {
        String symbols = "line with text";
        Map<Character, Integer> mapa = new HashMap<>();
        NumberOfOccurrences.printCountOfCharacters(mapa, symbols);
    }
}
