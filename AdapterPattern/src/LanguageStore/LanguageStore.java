package LanguageStore;

import java.util.HashMap;
import java.util.Map;

public class LanguageStore {
    static Map< String, String > englishToBanglaDictionary = new HashMap<>();
    static Map < String, String > banglaToEnglishDictionary = new HashMap<>();
    static Map < String, String > banglaQuestionToBanglaAnswer = new HashMap<>();
    static Map < String, String > englishQuestionToEnglishAnswer = new HashMap<>();

    public LanguageStore() {
        englishToBanglaDictionary.put ("how are you?", "আপনি কেমন আছেন?");
        englishToBanglaDictionary.put ("I am in USA", "আমি মার্কিন মধ্যে আছি");

        banglaQuestionToBanglaAnswer.put("আপনি কেমন আছেন?", "আমি ভালো আছি");
        englishQuestionToEnglishAnswer.put("where are you?", "I am in USA");

        banglaToEnglishDictionary.put ("আমি ভালো আছি", "I am fine");
        banglaToEnglishDictionary.put ("তুমি কোথায়?", "where are you?");
    }

    public static Map< String, String > getEnglishToBanglaDictionary() {
        return englishToBanglaDictionary;
    }

    public static Map< String, String > getBanglaToEnglishDictionary() {
        return banglaToEnglishDictionary;
    }

    public static Map< String, String > getBanglaQuestionToBanglaAnswer() {
        return banglaQuestionToBanglaAnswer;
    }
    public static Map< String, String > getEnglishQuestionToEnglishAnswer() {
        return englishQuestionToEnglishAnswer;
    }
}
