package Languages;

import LanguageConverter.LanguageConverter;
import LanguageStore.LanguageStore;

public class BanglaLanguage implements LanguageConverter {

    @Override
    public String askQuestion(String words) {
        LanguageStore languageStore = new LanguageStore();
        String replyFromBangla = LanguageStore.getBanglaToEnglishDictionary().get(words);
        return replyFromBangla;
    }

    @Override
    public String answerFromQuestion(String words) {
        LanguageStore languageStore = new LanguageStore();
        String replyFromBangla = LanguageStore.getBanglaQuestionToBanglaAnswer().get(words);
        return replyFromBangla;
    }
}
