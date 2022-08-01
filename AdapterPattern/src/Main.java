import LanguageTranslator.LanguageTranslator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LanguageTranslator languageTranslator = new LanguageTranslator();

        String whichLanguage = scanner.nextLine();
        String words = scanner.nextLine();

        System.out.println(languageTranslator.translateWordsToNewLanguage(whichLanguage, words));
    }
}