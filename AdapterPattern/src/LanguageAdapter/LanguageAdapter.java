package LanguageAdapter;

import LanguageConverter.LanguageConverter;
import LanguageMapper.LanguageMapper;
import LanguageNames.LanguageNames;
import LanguageStore.LanguageStore;
import Languages.BanglaLanguage;
import Languages.EnglishLanguage;

public class LanguageAdapter implements LanguageMapper {
    private LanguageConverter languageConverter;

    public LanguageAdapter(String whichLanguageToTranslate) {
        LanguageNames languageNames = LanguageNames.valueOf(whichLanguageToTranslate.toUpperCase());

        switch (languageNames) {
            case BANGLA:
                languageConverter = new BanglaLanguage();
                break;

            case ENGLISH:
                languageConverter = new EnglishLanguage();
                break;
        }
    }

    @Override
    public String translateWordsToNewLanguage(String whichLanguageToTranslate, String words) {
        LanguageNames languageNames = LanguageNames.valueOf(whichLanguageToTranslate.toUpperCase());
        String result = "";

        if(languageNames.equals(LanguageNames.BANGLA)) {
            String banglaWord = convertToBangla(words);
            System.out.println("==** Language Adapter Converted \"" + words + "\" to \"" + banglaWord + "\" and send the question to BanglaMan");

            String banglaWordsReply = new BanglaLanguage().answerFromQuestion(banglaWord);
            System.out.println("==** Language Adapter got reply from BanglaMan in Bangla: \"" + banglaWordsReply + "\"");

            String englishConverted = convertToEnglish(banglaWordsReply);
            System.out.println("==** Language Adapter converted \"" + banglaWordsReply + "\" to \"" + englishConverted + "\" and send back to EnglishMan");
            return englishConverted;

        } else if(languageNames.equals(LanguageNames.ENGLISH)) {
            String englishWord = convertToEnglish(words);
            System.out.println("==** Language Adapter Converted \"" + words + "\" to \"" + englishWord + "\" and send the question to EnglishMan");

            String englishWordsReply = new EnglishLanguage().answerFromQuestion(englishWord);
            System.out.println("==** Language Adapter got reply from EnglishMan in English: \"" + englishWordsReply + "\"");

            String banglaConverted = convertToBangla(englishWordsReply);
            System.out.println("==** Language Adapter converted \"" + englishWordsReply + "\" to \"" + banglaConverted + "\" and send back to BanglaMan");
            return banglaConverted;
        }
        return "Failed To Translate";
    }

    public String convertToEnglish (String words) {
        LanguageStore languageStore = new LanguageStore();
        return LanguageStore.getBanglaToEnglishDictionary().get(words);
    }
    public String convertToBangla (String words) {
        LanguageStore languageStore = new LanguageStore();
        return LanguageStore.getEnglishToBanglaDictionary().get(words);
    }
}
