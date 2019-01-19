package lesson22;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MAin {
    public static void main(String[] args) {
        Book book1 = new Book ("book1", "author1", false);
        Book book2 = new Book ("book2", "author2");
        Book book3 = new Book ("book3", "author3", false);
        Book book4 = new Book ("book4", "author4");
        Book book5 = new Book ("book5", "author5");
        Book book6 = new Book ("book6","author6", false);
        Book book7 = new Book ("book7", "author7");
        Book book8 = new Book ("book8", "author8", false);
        Book book9 = new Book ("book9", "author9");
        Book book10 = new Book ("book10", "author10", false);

        Library library = new Library ();
        library.addBooks (book1);
        library.addBooks (book2);
        library.addBooks (book3);
        library.addBooks (book4);
        library.addBooks (book5);
        library.addBooks (book6);
        library.addBooks (book7);
        library.addBooks (book8);
        library.addBooks (book9);
        library.addBooks (book10);
        System.out.println (library.booksOnHands);
        System.out.println (library.booksOnRR);
        new Thread (new Reader ("Kolya", library)).start ();
        new Thread (new Reader ("Tanya", library)).start ();

    }
}
