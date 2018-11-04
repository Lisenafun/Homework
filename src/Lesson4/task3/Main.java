package Lesson4.task3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Азбука");
        Book book2 = new Book("Harry Potter");
        Book book3 = new Book("Поющие в терновнике");
        library.put(book1,3);
        library.put(book2,5);
        System.out.println(library.toString());
        System.out.println (library.getSize ());
        library.put(book3,3);
        System.out.println(library.toString());
        System.out.println (library.get (book1,4));
        System.out.println(library.toString());

    }
}
