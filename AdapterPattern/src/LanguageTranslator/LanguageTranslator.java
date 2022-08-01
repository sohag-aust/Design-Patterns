package LanguageTranslator;

import LanguageAdapter.LanguageAdapter;
import LanguageMapper.LanguageMapper;
import LanguageNames.LanguageNames;

public class LanguageTranslator implements LanguageMapper {
    private LanguageAdapter languageAdapter;
    String result = "";

    @Override
    public String translateWordsToNewLanguage(String whichLanguageToTranslate, String words) {
        LanguageNames languageNames = LanguageNames.valueOf(whichLanguageToTranslate.toUpperCase());

        if(languageNames.equals(LanguageNames.BANGLA) || languageNames.equals(LanguageNames.ENGLISH)) {
            languageAdapter = new LanguageAdapter(whichLanguageToTranslate);
            result = languageAdapter.translateWordsToNewLanguage(whichLanguageToTranslate, words);
        } else {
            System.out.println("Unsupported Language");
        }
        return result;
    }
}
