// The single responsibility principle states that every Java class must perform a single functionality.
// Implementation of multiple functionalities in a single class mashup the code and if any modification is required may affect the whole class.


package solid;

public class Single {

    private String name;
    private String author;
    private String text;

    public Single(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}