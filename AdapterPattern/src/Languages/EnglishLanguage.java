package Languages;

import LanguageConverter.LanguageConverter;
import LanguageStore.LanguageStore;

public class EnglishLanguage implements LanguageConverter {

    @Override
    public String askQuestion(String words) {
        LanguageStore languageStore = new LanguageStore();
        String replyFromEnglish = LanguageStore.getEnglishQuestionToEnglishAnswer().get(words);
        return replyFromEnglish;
    }

    @Override
    public String answerFromQuestion(String words) {
        LanguageStore languageStore = new LanguageStore();
        String replyFromEnglish = LanguageStore.getEnglishQuestionToEnglishAnswer().get(words);
        return replyFromEnglish;
    }
}
