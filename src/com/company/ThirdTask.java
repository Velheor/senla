package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdTask {
    public static List<String> sortByLengthAndFirstLetterToUpperRegister(String text) {
        List<String> wordsInText = Arrays.asList(text.split(" "));
        wordsInText.sort(Comparator.comparingInt((s1 -> Math.abs(s1.length() - "Hello World".length()))));
        wordsInText.replaceAll(word -> word = word.substring(0, 1).toUpperCase() + word.substring(1));
        return wordsInText;
    }
}
