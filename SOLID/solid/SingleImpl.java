package solid;

public class SingleImpl {

    public String replaceWordInText(String text, String word, String replacementWord) {
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String text, String word) {
        return text.contains(word);
    }
}