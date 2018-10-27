package Lesson4.task3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book();
        Book book2 = new Book();
        library.put(book1,2);
        library.put(book2,3);
        library.put(book2,6);
        System.out.println(library.toString());
    }
}
