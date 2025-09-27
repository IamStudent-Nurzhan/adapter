//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EnglishMen englishMen = new EnglishMen();
        IRussianMen translator = new TranslatorAdapter(englishMen);
        translator.speakRussian("Привет");
        translator.speakRussian("Как дела?");
        translator.speakRussian("Спасибо");
        }
    }
