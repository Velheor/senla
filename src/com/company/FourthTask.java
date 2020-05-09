package com.company;

import java.util.Arrays;
import java.util.List;

public class FourthTask {
    public static Long countOfWordInText(String text, String word) {
        List<String> wordsInText = Arrays.asList(text.split(" "));
        wordsInText.replaceAll(String::toLowerCase);
        return wordsInText.stream().filter(wordInText -> wordInText.equals(word.toLowerCase())).count();
    }
}
