public class TranslatorAdapter implements IRussianMen {
    private EnglishMen englishSpeaker;

    public TranslatorAdapter(EnglishMen englishSpeaker) {
        this.englishSpeaker = englishSpeaker;
    }

    @Override
    public void speakRussian(String words) {
        String translated = translateRussianToEnglish(words);
        englishSpeaker.speakEnglish(translated);
    }

    private String translateRussianToEnglish(String russianText) {
        if (russianText.equalsIgnoreCase("Привет")) return " Hello";
        if (russianText.equalsIgnoreCase("Как дела?")) return " How are you?";
        if (russianText.equalsIgnoreCase("Спасибо")) return " Thank you";
        else return "Error";
    }
}
