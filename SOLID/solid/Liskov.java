package solid;

public class Liskov extends SingleImpl{
    public String replaceAll(String text, String regex, String replacement) {
        return text.replaceAll(regex, replacement);
    }


}