import solid.Liskov;
import solid.Open;
import solid.Single;
import solid.SingleImpl;

public class Main {
    public static void main(String[] args) {
//Single Responsibility
        Single book = new Single("The Art of Learning", "Josh Waitzkin", "This is a sample text");
        SingleImpl singleImpl =new SingleImpl();
        String newText = singleImpl.replaceWordInText(book.getText(), "sample", "example");
        boolean containsWord = singleImpl.isWordInText(book.getText(), "example");



        System.out.println("Updated Text: " + newText);
        System.out.println("Contains 'example'? " + containsWord);


        //Open/Closed
        Open open=new Open();
        int wordCount = open.countWords(book.getText());

        System.out.println("Word Count: " + wordCount);


        //Liskov Substitution Principle
        Liskov liskov=new Liskov();
        newText = liskov.replaceAll("Hello, world!", "world", "universe");
        System.out.println(newText);
    }

}