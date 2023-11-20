package com.telran.org.homeworktwelve;

import java.util.Map;

public class NumberOfOccurrences {

    public static void printCountOfCharacters (Map<Character, Integer> mapa, String lineWithText) {
        for (char i : lineWithText.toCharArray()){
            if (mapa.containsKey(i)) {
                mapa.put(i, mapa.get(i) + 1);
            } else {
                mapa.put(i, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
