package lesson22;

public class Book {
    private String name;
    private String author;
    private boolean isGiveOnHands;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.isGiveOnHands = true;
    }
    public Book(String name, String author, boolean isGiveOnHands) {
        this.name = name;
        this.author = author;
        this.isGiveOnHands = isGiveOnHands;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isGiveOnHands() {
        return isGiveOnHands;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '}';
    }
}
